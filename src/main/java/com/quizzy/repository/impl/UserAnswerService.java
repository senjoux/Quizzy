package com.quizzy.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizzy.entity.Answer;
import com.quizzy.entity.Question;
import com.quizzy.entity.User;
import com.quizzy.entity.UserAnswer;
import com.quizzy.repository.IUserAnswerRepo;
import com.quizzy.service.IUserAnswerService;

@Service
public class UserAnswerService implements IUserAnswerService{

	@Autowired 
	IUserAnswerRepo userAnswerRepo;

	public UserAnswer addUserAnswer(Question question, Answer answer, User user) {
		UserAnswer temp=new UserAnswer(question, answer, user);
		return userAnswerRepo.save(temp);
	}

	public UserAnswer findUserAnswer(Integer userAnswerID) {
		return userAnswerRepo.findOne(userAnswerID);
	}
	
	public boolean deleteUserAnswer(Integer userAnswerID) {
		userAnswerRepo.delete(userAnswerID);
		UserAnswer temp=userAnswerRepo.findOne(userAnswerID);
		if(temp!=null){
			return false;
		}
		return true;
	}

	public List<UserAnswer> findByUser(User user){
		return userAnswerRepo.findByUser(user);
	}
	
	public List<UserAnswer> findByQuestion(Question question){
		return userAnswerRepo.findByQuestion(question);
	}
	
	public List<UserAnswer> findByAnswer(Answer answer){
		return userAnswerRepo.findByAnswer(answer);
	}
	
	public List<UserAnswer> findByUserAndQuestion(User user,Question question){
		return userAnswerRepo.findByUserAndQuestion(user, question);
	}
	
	public List<UserAnswer> findByQuestionAndAnswer(Question question,Answer answer){
		return userAnswerRepo.findByQuestionAndAnswer(question, answer);
	}

	
}
