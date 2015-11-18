package com.quizzy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.quizzy.entity.Answer;
import com.quizzy.entity.Question;

public interface IAnswerRepo extends CrudRepository<Answer, Integer>{
	
	List<Answer> findByAnswerTextLike(String answer_text);

	List<Answer> findByQuestion(Question question);
	
	List<Answer> findByCorrectIsTrueAndQuestion(Question question);
	List<Answer> findByCorrectIsFalseAndQuestion(Question question);
	 
}
