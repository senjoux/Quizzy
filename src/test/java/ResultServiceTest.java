import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.quizzy.entity.Question;
import com.quizzy.entity.Result;
import com.quizzy.entity.User;
import com.quizzy.repository.impl.QuestionService;
import com.quizzy.repository.impl.ResultService;
import com.quizzy.repository.impl.UserService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=QuizzyLauncher.class,loader=AnnotationConfigContextLoader.class)
public class ResultServiceTest {

	@Autowired
	ResultService resultService;
	@Autowired
	UserService userService;
	@Autowired
	QuestionService questionService;
	
	/*
	@Test
	public void addResultTest(){
		Result temp=resultService.addResult(questionService.findQuestion(3), userService.findUser(3), false);
		assertEquals("result id ", 3, temp.getResultID().intValue());
	}
	*/
	
	/*
	@Test
	public void findResultTest(){
		assertNotNull("result ", resultService.findResult(2));
	}
	*/

	/*
	@Test
	public void findByUserTest(){
		User user=userService.findUser(3);
		assertEquals("results", 2, resultService.findByUser(user).size());
	}
	 */
	
	/*
	@Test
	public void findByQuestionTest(){
		Question question=questionService.findQuestion(3);
		assertEquals("results", 3, resultService.findByQuestion(question).size());
	}
	*/
	
	/*
	@Test
	public void findByCorrectIsTrueTest(){
		assertEquals("results", 1, resultService.findByCorrectIsTrue().size());
	}
	*/
	
	/*
	@Test
	public void findByUserAndCorrectIsTrueTest(){
		User user=userService.findUser(3);
		assertEquals("results", 1, resultService.findByUserAndCorrectIsTrue(user).size());
	}
	*/
	
	// last test oups :D
	
	/*
	@Test
	public void findByQuestionAndCorrectIsFalseTest(){
		Question question=questionService.findQuestion(3);
		assertEquals("results", 2, resultService.findByQuestionAndCorrectIsFalse(question).size());
	}
	*/
	
	
}
