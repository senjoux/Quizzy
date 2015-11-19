package com.quizzy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.quizzy.entity.Answer;
import com.quizzy.entity.Question;
import com.quizzy.entity.User;
import com.quizzy.entity.UserAnswer;

public interface IUserAnswerRepo extends CrudRepository<UserAnswer, Integer>{

	
	List<UserAnswer> findByUser(User user);
	
	List<UserAnswer> findByUserAndQuestion(User user,Question question);
	
	List<UserAnswer> findByQuestionAndAnswer(Question question,Answer answer);
	
	List<UserAnswer> findByQuestion(Question question);
	
	List<UserAnswer> findByAnswer(Answer answer);
	
	
	
	

}
