import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.quizzy.repository")
@PropertySource("classpath:quizzy.app.properties")
@ComponentScan(basePackages = "com.quizzy")
@EnableTransactionManagement
public class QuizzyLauncher {

	@Autowired
	private Environment env;

	@Bean(name = "message_bean")
	public String getMessageDeMeeting() {
		return env.getProperty("message");
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("db.driver"));
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setUsername(env.getProperty("db.username"));
		dataSource.setPassword(env.getProperty("db.password"));
		return dataSource;
	}

	private Properties additionalJpaProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect",env.getProperty("hibernate.dialect"));
		properties.setProperty("hibernate.hbm2ddl.auto",env.getProperty("hibernate.hbm2ddl.auto"));
		/*
		 * create-drop ou validate
		 */
		properties.setProperty("hibernate.show_sql",env.getProperty("hibernate.show_sql"));
		// properties.setProperty("hibernate.connection.driver_class",
		// env.getProperty("hibernate.hbm2ddl.auto"));

		return properties;
	}

	@Bean
	public EntityManagerFactory entityManagerFactory() {
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setGenerateDdl(true);
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setJpaVendorAdapter(vendorAdapter);
		factory.setPackagesToScan("com.quizzy");
		factory.setDataSource(dataSource());
		factory.setJpaProperties(additionalJpaProperties());
		factory.afterPropertiesSet();
		return factory.getObject();
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactory());
		return txManager;
	}
	
	/*
	public void execute() {
			@SuppressWarnings("resource")
			ApplicationContext context = new AnnotationConfigApplicationContext(QuizzyLauncher.class);
			// call to controllers ...
			System.out.println("bonjour ..");
		    }

	public static void main(String[] args) {
		new QuizzyLauncher().execute();
	}
*/
}
