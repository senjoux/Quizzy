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

	private Integer resultID;
	
	private Question question;
	
	private User user;
	
	private boolean correct;
	
	
	
	public Result() {}
	
	
	
	public Result(Question question, User user, boolean correct) {
		this.question = question;
		this.user = user;
		this.correct = correct;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "RESULT_ID",unique=true,nullable=false )
	public Integer getResultID() {
		return resultID;
	}
	public void setResultID(Integer resultID) {
		this.resultID = resultID;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="QUESTION_ID",nullable=false)
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
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
	
	
	
	
	
	
}
