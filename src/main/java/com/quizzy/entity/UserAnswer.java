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
public class UserAnswer implements Serializable {
		
	
	private static final long serialVersionUID = 5103209098843392872L;

	
	private Integer userAnswerID;
	
	private Question question;
	
	private Answer answer;
	
	private User user;
	
	
	
	public UserAnswer() {}
	
	
	public UserAnswer(Question question, Answer answer, User user) {
		this.question = question;
		this.answer = answer;
		this.user = user;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "USER_ANSWER_ID",unique=true,nullable=false )
	public Integer getUserAnswerID() {
		return userAnswerID;
	}
	public void setuserAnswerID(Integer userAnswerID) {
		this.userAnswerID = userAnswerID;
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
	@JoinColumn(name="ANSWER_ID",nullable=false)
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="USER_ID",nullable=false)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result
				+ ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result
				+ ((userAnswerID == null) ? 0 : userAnswerID.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAnswer other = (UserAnswer) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (userAnswerID == null) {
			if (other.userAnswerID != null)
				return false;
		} else if (!userAnswerID.equals(other.userAnswerID))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "UserAnswer [userAnswerID=" + userAnswerID + ", question="
				+ question + ", answer=" + answer + ", user=" + user + "]";
	}
	
	
	
	
}
