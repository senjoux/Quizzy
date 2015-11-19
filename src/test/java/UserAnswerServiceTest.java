import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.*;

import com.quizzy.entity.Answer;
import com.quizzy.entity.Question;
import com.quizzy.entity.User;
import com.quizzy.entity.UserAnswer;
import com.quizzy.repository.impl.AnswerService;
import com.quizzy.repository.impl.QuestionService;
import com.quizzy.repository.impl.UserAnswerService;
import com.quizzy.repository.impl.UserService;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=QuizzyLauncher.class,loader=AnnotationConfigContextLoader.class)
public class UserAnswerServiceTest {

	@Autowired
	UserAnswerService userAnswerService;
	@Autowired
	QuestionService questionService;
	@Autowired
	AnswerService answerService;
	@Autowired
	UserService userService;
	
	/*
	@Test
	public void userAnswerAdddTest(){
		Question question=questionService.findQuestion(3);
		Answer answer=answerService.findAnswer(1);
		User user=userService.findUser(3);
		assertNotNull("user answer", userAnswerService.addUserAnswer(question, answer, user));
	}
	*/
	
	/*
	@Test
	public void findUserAnswerTest(){
		UserAnswer temp=userAnswerService.findUserAnswer(2);
		//System.out.println(temp.toString());
		assertNotNull("user answer", temp);
	}
	*/
	
	/*
	@Test
	public void findByUserTest(){
		User user=userService.findUser(1);
		assertEquals("number of user answers", 2, userAnswerService.findByUser(user).size());
	}
	*/
	
	/*
	@Test
	public void findByQuestionTest(){
		//Question question1=questionService.findQuestion(2);
		Question question2=questionService.findQuestion(3);
		
		//assertEquals("number of user answers", 0, userAnswerService.findByQuestion(question1).size());
		assertEquals("number of user answers", 3, userAnswerService.findByQuestion(question2).size());

	}
	*/
	
	/*
	@Test
	public void findByAnswer(){
		//Answer answer1=answerService.findAnswer(1);
		Answer answer2=answerService.findAnswer(2);
		//assertEquals("number of user answers", 2, userAnswerService.findByAnswer(answer1).size());
		assertEquals("number of user answers", 1, userAnswerService.findByAnswer(answer2).size());
	}
	*/
	
	/*
	@Test
	public void findByUserAndQuestion(){
		Question question=questionService.findQuestion(3);
		//User user1=userService.findUser(1);
		User user2=userService.findUser(4);

		//assertEquals("number of user answers", 2, userAnswerService.findByUserAndQuestion(user1, question).size());
		assertEquals("number of user answers", 0, userAnswerService.findByUserAndQuestion(user2, question).size());
	}
	*/
	
	/*
	@Test
	public void findByQuestionAndAnswer(){
		Question question=questionService.findQuestion(3);
		//to gain time purpose i will get answer by answer service instead of getting it from question.answers() 
		 // u konw ... itarating thought a set realy pisses me off :D ...
		 
		//Answer answer1=answerService.findAnswer(1);
		Answer answer2=answerService.findAnswer(2);
		//assertEquals("number of user answers", 2, userAnswerService.findByQuestionAndAnswer(question, answer1).size());
		assertEquals("number of user answers", 1, userAnswerService.findByQuestionAndAnswer(question, answer2).size());
	}
	*/
}
