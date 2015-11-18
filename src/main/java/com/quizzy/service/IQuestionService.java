package com.quizzy.service;

import com.quizzy.entity.Question;

public interface IQuestionService {

	Question findQuestion(Integer questionID);
	
	Question addQuestion(String questionText, int level);
	Question addQuestion(String questionText);
		
	boolean deleteQuestion(Integer questionID);
	
	Question updateQuestion(Integer questionID, Question question); 
	Question updateQuestionText(Integer questionID, String questionText);
	Question updateQuestionLevel(Integer questionID,int level);
	
}
