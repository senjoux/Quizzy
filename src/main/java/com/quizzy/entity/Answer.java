package com.quizzy.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="answer")
public class Answer implements Serializable {

	private static final long serialVersionUID = -1878984191983675295L;

	Integer answer_id;
	
	String answerText;
	
	boolean correct;
	
	Question question;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ANSWER_ID",unique=true,nullable=false )
	public Integer getAnswer_id() {
		return answer_id;
	}


	public void setAnswer_id(Integer answer_id) {
		this.answer_id = answer_id;
	}
	

	@Column(name = "ANSWER_TEXT", unique = true, nullable = false, length = 50)
	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	@Column(name = "IS_CORRECT",  nullable = false)
	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="QUESTION_ID",nullable=false)
	public Question getQuestion() {
		return question;
	}
	
	public void setQuestion(Question question) {
		this.question = question;
	}

	

	
	
	
}
