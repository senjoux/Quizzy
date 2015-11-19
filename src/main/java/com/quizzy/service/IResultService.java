package com.quizzy.service;

import com.quizzy.entity.Question;
import com.quizzy.entity.Result;
import com.quizzy.entity.User;

public interface IResultService {
	
	Result findResult(Integer resultID);
	Result addResult(Question question, User user,boolean correct);
	
	boolean deleteResult(Integer resultID);
	
}
