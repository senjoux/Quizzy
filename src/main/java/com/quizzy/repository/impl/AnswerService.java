package com.quizzy.repository.impl;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizzy.entity.Answer;
import com.quizzy.entity.Question;
import com.quizzy.repository.IAnswerRepo;
import com.quizzy.service.IAnswerService;

@Service
public class AnswerService implements IAnswerService{

	@Autowired
	IAnswerRepo answerRepo;
	
	public Answer findAnswer(Integer answerID) {
		return answerRepo.findOne(answerID);
	}

	public Answer addAnswer(String answerText, boolean correct,
			Question question) {
		Answer answer =new Answer(answerText, correct);
		
		// make sure if the question already have a correct answer 
		Set<Answer>	temp=question.getQuestionAnswers();
		Iterator<Answer> i=temp.iterator();
		boolean found=false;
		while(i.hasNext()){
			if(i.next().isCorrect()){
				found=true;
				break;
			}
		}
		//if it has a correct answer return null
		if(answer.isCorrect()){
			if (found) {
				return null;	
				}
			}
		//if not, save the answer 
		answer.setQuestion(question);
		return answerRepo.save(answer);
	}

	public boolean deleteAnswer(Integer answerID) {
		answerRepo.delete(answerID);
		Answer temp=answerRepo.findOne(answerID);
		if(temp!=null){
			return false;
		}
		return true;
	}

	public Answer updateAnswerCorrect(Integer answerID,boolean correct) {
		Answer answer=answerRepo.findOne(answerID);
		
		// make sure if the question already have a correct answer 
				Set<Answer>	temp=answer.getQuestion().getQuestionAnswers();
				Iterator<Answer> i=temp.iterator();
				boolean found=false;
				while(i.hasNext()){
					if(i.next().isCorrect()){
						found=true;
						break;
					}
				}
				//if it already has a correct answer return null
				if(correct){
					if (found) {
						return null;	
						}
					}
				//if not, save the answer 
				answer.setCorrect(correct);
				return answerRepo.save(answer);
	}

	public Answer updateAnswerText(Integer answerID, String answerText) {
		Answer temp=answerRepo.findOne(answerID);
		temp.setAnswerText(answerText);
		return answerRepo.save(temp);
	}

}
