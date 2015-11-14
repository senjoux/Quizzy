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
@Table(name="user_answer")
public class User_Answer implements Serializable {
		
	
	private static final long serialVersionUID = 5103209098843392872L;

	
	Integer user_answer_id;
	
	Question question;
	
	Answer answer;
	
	User user;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "USER_ANSWER_ID",unique=true,nullable=false )
	public Integer getUser_answer_id() {
		return user_answer_id;
	}
	public void setUser_answer_id(Integer user_answer_id) {
		this.user_answer_id = user_answer_id;
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
	@JoinColumn(name="ANSWER_ID",nullable=false)
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="USER_ID",nullable=false)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
