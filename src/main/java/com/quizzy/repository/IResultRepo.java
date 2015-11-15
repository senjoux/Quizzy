package com.quizzy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.quizzy.entity.Question;
import com.quizzy.entity.Result;
import com.quizzy.entity.User;

public interface IResultRepo extends CrudRepository<Result, Integer>{

	List<Result> findByUser(User user);
	
	List<Result> findByQuestion(Question question);

	List<Result> findByCorrectIsTrue();
	
	List<Result> findByUserAndCorrectIsTrue(User user);

}
