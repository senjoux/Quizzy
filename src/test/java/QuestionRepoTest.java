import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.quizzy.entity.Question;
import com.quizzy.repository.impl.QuestionService;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=QuizzyLauncher.class,loader=AnnotationConfigContextLoader.class)
public class QuestionRepoTest {

	@Autowired
	QuestionService questionService;
	
	/*
	@Test
	public void questionAdddTest(){
		Question actual=new Question("ou ?", 1);
		Question expected=questionService.addQuestion("ou ?", 1);
		assertEquals("question", expected, actual);
	}
	*/
	
	/*
	@Test
	public void updateQuestionTextTest(){
		Question actual=new Question("combient ?", 3);
		Question expected=questionService.updateQuestionText(1, "combient ?");
		assertEquals("cc", expected, actual);
	}
	*/
	
	/*
	@Test
	public void updateQuestion(){
		Question actual=new Question("yy ?", 5);
		Question expected=questionService.updateQuestion(1, actual);
		assertEquals("cc", expected, actual);
	}
	*/
	
	/*
	@Test
	public void updateQuestionLevel(){
		Question actualQ=new Question("yy ?", 2);
		Question expectedQ=questionService.updateQuestionLevel(1, 2);
		assertEquals("level", expectedQ.getLevel(),actualQ.getLevel());
	}
	*/
	
	/*
	@Test
	public void deleteQuestion(){
		assertEquals("xx", true,questionService.deleteQuestion(3));
	}
	*/
	
	/*
	@Test
	public void findByQuestionTextLikeTest(){
			int expected =2;
			int actual=questionService.findByQuestionTextLike("%c%").size();
			assertEquals(expected, actual);
	}
	*/
	
	/*
	@Test
	public void findByQuestionLevelTest(){
			int expected =1;
			int actual=questionService.findByLevel(2).size();
			assertEquals(expected, actual);
	}
	*/
	
	/*
	@Test
	public void findByLevelGreaterThanTest(){
			int expected =1;
			int actual=questionService.findByLevelGreaterThan(2).size();
			assertEquals(expected, actual);
	}
	*/
	
	/*
	@Test
	public void findByLevelGreaterThanEqualTest(){
			int expected =2;
			int actual=questionService.findByLevelGreaterThanEqual(2).size();
			assertEquals("number of quesions ",expected, actual);
	}
	*/
	
	
}
