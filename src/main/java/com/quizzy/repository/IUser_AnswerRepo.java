package com.quizzy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.quizzy.entity.Answer;
import com.quizzy.entity.Question;
import com.quizzy.entity.User;
import com.quizzy.entity.User_Answer;

public interface IUser_AnswerRepo extends CrudRepository<User_Answer, Integer>{

	
	List<User_Answer> findByUser(User user);
	
	List<User_Answer> findByUserAndQuestion(User user,Question question);
	
	List<User_Answer> findByQuestionAndAnswer(Question question,Answer answer);

}
