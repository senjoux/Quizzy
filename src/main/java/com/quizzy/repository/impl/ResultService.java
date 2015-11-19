package com.quizzy.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizzy.entity.Question;
import com.quizzy.entity.Result;
import com.quizzy.entity.User;
import com.quizzy.repository.IResultRepo;
import com.quizzy.service.IResultService;

@Service
public class ResultService implements IResultService{

	@Autowired
	IResultRepo resultRepo;

	public Result findResult(Integer resultID) {
		return resultRepo.findOne(resultID);
	}

	public Result addResult(Question question, User user, boolean correct) {
		Result temp=new Result(question, user, correct);
		return resultRepo.save(temp);
	}

	public boolean deleteResult(Integer resultID) {
		resultRepo.delete(resultID);
		Result temp=resultRepo.findOne(resultID);
		if(temp!=null){
			return false;
		}
		return true;
	}
	
	public List<Result> findByUser(User user){
		return resultRepo.findByUser(user);
	}
	
	public List<Result> findByQuestion(Question question){
		return resultRepo.findByQuestion(question);
	}
	
	public List<Result> findByCorrectIsTrue(){
		return resultRepo.findByCorrectIsTrue();
	}
	
	public List<Result> findByCorrectIsFalse(){
		return resultRepo.findByCorrectIsFalse();
	}
	
	public List<Result> findByUserAndCorrectIsTrue(User user){
		return resultRepo.findByUserAndCorrectIsTrue(user);
	}
	
	public List<Result> findByUserAndCorrectIsFalse(User user){
		return resultRepo.findByUserAndCorrectIsFalse(user);
	}
	
	public List<Result> findByQuestionAndCorrectIsTrue(Question question){
		return resultRepo.findByQuestionAndCorrectIsTrue(question);
	}
	
	public List<Result> findByQuestionAndCorrectIsFalse(Question question){
		return resultRepo.findByQuestionAndCorrectIsFalse(question);
	}
}
