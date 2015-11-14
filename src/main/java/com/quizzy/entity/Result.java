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
@Table(name="result")
public class Result implements Serializable{


	private static final long serialVersionUID = 4411181409445218557L;

	Integer result_id;
	
	Question question;
	
	User user;
	
	boolean correct;
	
	Double score;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "RESULT_ID",unique=true,nullable=false )
	public Integer getResult_id() {
		return result_id;
	}
	public void setResult_id(Integer result_id) {
		this.result_id = result_id;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="QUESTION_ID",nullable=false)
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="USER_ID",nullable=false)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Column(name = "IS_CORRECT",  nullable = false)
	public boolean isCorrect() {
		return correct;
	}
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
	@Column(name = "SCORE",  nullable = false)
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	
	
	
	
}
