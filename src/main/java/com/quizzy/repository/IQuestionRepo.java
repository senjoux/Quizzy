package com.quizzy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.quizzy.entity.Question;

public interface IQuestionRepo extends CrudRepository<Question, Integer> {

	
	List<Question> findByQuestionText(String questionText);
	List<Question> findByQuestionTextLike(String questionText);
	
	List<Question> findByLevel(int level);
	List<Question> findByLevelGreaterThan(int level);
	List<Question> findByLevelGreaterThanEqual(int level);
	
}
