package com.quizzy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.quizzy.entity.Question;

public interface IQuestionRepo extends CrudRepository<Question, Integer> {

	List<Question> findByQuestion_text(String question_text);
	List<Question> findByQuestion_textLike(String question_text);
	
	List<Question> findByLevelGreaterThan(Integer level);
	List<Question> findByLevelGreaterThanEqual(Integer level);
	
}
