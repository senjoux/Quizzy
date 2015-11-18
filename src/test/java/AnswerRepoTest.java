import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.quizzy.entity.Answer;
import com.quizzy.entity.Question;
import com.quizzy.repository.impl.AnswerService;
import com.quizzy.repository.impl.QuestionService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=QuizzyLauncher.class,loader=AnnotationConfigContextLoader.class)
public class AnswerRepoTest {

	@Autowired
	QuestionService questionService;
	
	@Autowired
	AnswerService answerService;
	
	/*
	@Test
	public void answerAddTest(){
		Question question=questionService.findQuestion(3);
		Answer expected=answerService.addAnswer("tn2", false, question);
		assertNotNull(expected);
	}
	*/
	
	/*
	@Test
	public void answerDeleteTest(){
		assertEquals("xx", true, answerService.deleteAnswer(7));
	}
	*/
	
	/*
	@Test
	public void updateAnswerCorrectTest(){
		assertNull(answerService.updateAnswerCorrect(3, true));
	}
	*/
	
	/*
	@Test
	public void updateAnswerTextTest(){
		assertEquals("answer text","de", answerService.updateAnswerText(3, "de").getAnswerText());
	}
	*/
	
	
	
}
