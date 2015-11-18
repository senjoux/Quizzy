package com.quizzy.service;

import com.quizzy.entity.Answer;
import com.quizzy.entity.Question;

public interface IAnswerService {

	Answer findAnswer(Integer answerID);
	Answer addAnswer(String answerText,boolean correct,Question question);
	
	boolean deleteAnswer(Integer answerID);
	
	Answer updateAnswerCorrect(Integer answerID,boolean correct); 
	Answer updateAnswerText(Integer answerID,String answerText); 
	
}
