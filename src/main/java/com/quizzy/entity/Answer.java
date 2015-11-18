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
import java.util.Objects;

@Entity
@Table(name="answer")
public class Answer implements Serializable {

	private static final long serialVersionUID = -1878984191983675295L;

	private Integer AnswerID;
	
	private String answerText;
	
	private boolean correct;
	
	private Question question;
	


	public Answer() {}
	
	public Answer(String answerText, boolean correct) {
		this.answerText = answerText;
		this.correct = correct;
	}
	
	public Answer(String answerText, boolean correct, Question question) {
		this.answerText = answerText;
		this.correct = correct;
		this.question = question;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ANSWER_ID",unique=true,nullable=false )
	public Integer getAnswerID() {
		return AnswerID;
	}


	public void setAnswerID(Integer AnswerID) {
		this.AnswerID = AnswerID;
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="QUESTION_ID",nullable=false)
	public Question getQuestion() {
		return question;
	}
	
	public void setQuestion(Question question) {
		this.question = question;
	}

	
	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Answer)) {
			return false;
		}
		Answer castOther = (Answer) other;
		return Objects.equals(answerText, castOther.answerText)
				&& Objects.equals(correct, castOther.correct)
				&& Objects.equals(question, castOther.question);
	}

	@Override
	public int hashCode() {
		return Objects.hash(answerText, correct, question);
	}

	
	
}
