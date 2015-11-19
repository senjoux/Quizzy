package com.quizzy.service;

import com.quizzy.entity.Answer;
import com.quizzy.entity.Question;
import com.quizzy.entity.User;
import com.quizzy.entity.UserAnswer;

public interface IUserAnswerService {

	UserAnswer addUserAnswer(Question question, Answer answer, User user);
	
	UserAnswer findUserAnswer(Integer userAnswerID);

	boolean deleteUserAnswer(Integer userAnswerID);
}
