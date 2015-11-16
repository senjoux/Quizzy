import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.quizzy.entity.User;
import com.quizzy.repository.impl.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=QuizzyLauncher.class,loader=AnnotationConfigContextLoader.class)
public class UserRepoTest  {

	@Autowired
	UserService userService;
	
	@Test
	public void userAdddTest(){
		User expected=new User(true, "hedhly", "hamza", "hamza@gmail.com", "123");
		User actual=userService.addUser(true, "hedhly", "hamza", "hamza@gmail.com", "123");
		assertEquals("cc", expected, actual);
	}
	
	
}
