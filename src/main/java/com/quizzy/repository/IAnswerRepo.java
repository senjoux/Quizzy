package com.quizzy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.quizzy.entity.Answer;
import com.quizzy.entity.Question;

public interface IAnswerRepo extends CrudRepository<Answer, Integer>{
	
	List<Answer> findByAnswer_textLike(String answer_text);

	List<Answer> findByQuestion(Question question);

}
