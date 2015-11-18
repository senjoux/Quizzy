package com.quizzy.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizzy.entity.Question;
import com.quizzy.repository.IQuestionRepo;
import com.quizzy.service.IQuestionService;

@Service
public class QuestionService implements IQuestionService{

	@Autowired
	IQuestionRepo questionRepo;
	
	public Question addQuestion(String questionText, int level) {
		Question question=new Question(questionText,level);
		return questionRepo.save(question);
	}
	

	public Question addQuestion(String questionText) {
		Question question=new Question(questionText);
		question.setLevel(1);
		return questionRepo.save(question);
	}

	public Question updateQuestionText(Integer questioID, String questionText) {
		Question temp=questionRepo.findOne(questioID);
		temp.setQuestionText(questionText);	
		return questionRepo.save(temp);
	}
	
	public Question updateQuestion(Integer questioID, Question question) {
		Question temp=questionRepo.findOne(questioID);
		temp.setQuestionText(question.getQuestionText());
		temp.setLevel(question.getLevel());
		return questionRepo.save(temp);
	}

	public Question updateQuestionLevel(Integer questioID, int level) {
		Question temp=questionRepo.findOne(questioID);
		temp.setLevel(level);
		return questionRepo.save(temp);
	}
	
	public boolean deleteQuestion(Integer questioID) {
		questionRepo.delete(questioID);
		Question temp=questionRepo.findOne(questioID);
		if(temp!=null){
			return false;
		}
		return true;
	}

	public Question findQuestion(Integer questionID) {		
		return questionRepo.findOne(questionID);
	}
	
	public List<Question> findByQuestionText(String questionText){
		return questionRepo.findByQuestionText(questionText);
	}

	public List<Question> findByQuestionTextLike(String questionText){
		return questionRepo.findByQuestionTextLike(questionText);
	}
	
	public List<Question> findByLevel(int level){
		return questionRepo.findByLevel(level);
	}
	
	public List<Question> findByLevelGreaterThan(int level){
		return questionRepo.findByLevelGreaterThan(level);
	}
	
	public List<Question> findByLevelGreaterThanEqual(int level){
		return questionRepo.findByLevelGreaterThanEqual(level);
	}
	
}
