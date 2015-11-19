import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.mysql.fabric.xmlrpc.base.Array;
import com.quizzy.entity.User;
import com.quizzy.repository.impl.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=QuizzyLauncher.class,loader=AnnotationConfigContextLoader.class)
public class UserServiceTest  {

	@Autowired
	UserService userService;
	
	/*
	@Test
	public void userAdddTest(){
		User expected=new User(true, "hedhly", "hassanin", "hassen@gmail.com", "123");
		User actual=userService.addUser(true, "hedhly", "hassanin", "hassanin@gmail.com", "123");
		assertEquals("cc", expected, actual);
	}
	*/
	
	/*
	@Test
	public void userUpdateTest(){
		User actual=userService.updateUser(1, new User(true, "elhedhly","salah","hamza@gmail.com", "123456"));
		User expected=new User(true, "elhedhly","salah","hamza@gmail.com", "123456");
		assertEquals("xx", expected, actual);
	}*/
	
	/*
	@Test
	public void userScoreUpdateTest(){
		User actual=userService.updateUserScore(1, 15);
		User expected=new User(true, "elhedhly","salah","hamza@gmail.com", "123456");
		assertEquals("xx", expected, actual);
	}
	*/
	
	/*
	@Test
	public void userDeleteTest(){
		assertEquals("xx", true, userService.deleteUser(2););
	}
	*/
	
/*
	@Test
	public void findBynameLikeTest(){
		/*ArrayList<User> lst=new ArrayList<User>();
		lst.addAll();
		Iterator<User> i=lst.iterator();
		while (i.hasNext()) {
			System.out.println(i.next().toString());			
		}
		
		int expected=2;
		int actual =userService.findByNameLike("%hl%").size();
		assertEquals("number of rows",expected, actual);
	}
	*/
}
