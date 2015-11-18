package com.quizzy.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import java.util.Objects;

@Entity
@Table(name="question",uniqueConstraints={@UniqueConstraint(columnNames="QUESTION_TEXT")})
public class Question implements Serializable {

	
	private static final long serialVersionUID = 805756794398297113L;
	
	private Integer questionID;
	
	private String questionText;
	
	private Set<Answer> questionAnswers=new HashSet<Answer>(0);

	private int level;
	
	
	public Question(){}
	
	public Question(String questionText, int level) {
		super();
		this.questionText = questionText;
		this.level = level;
	}
	
	

	public Question(String questionText) {
		super();
		this.questionText = questionText;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "QUESTION_ID",unique=true,nullable=false )
	public Integer getquestionID() {
		return questionID;
	}

	public void setquestionID(Integer questionID) {
		this.questionID = questionID;
	}

	@Column(name = "QUESTION_TEXT", unique = true, nullable = false, length = 150)
	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}


	@OneToMany(fetch = FetchType.EAGER, mappedBy = "question",cascade=CascadeType.ALL)
	public Set<Answer> getQuestionAnswers() {
		return questionAnswers;
	}

	public void setQuestionAnswers(Set<Answer> questionAnswers) {
		this.questionAnswers = questionAnswers;
	}

	@Column(name = "LEVEL", nullable = false)
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Question)) {
			return false;
		}
		Question castOther = (Question) other;
		return Objects.equals(questionText, castOther.questionText)
				&& Objects.equals(level, castOther.level);
	}

	@Override
	public int hashCode() {
		return Objects.hash(questionText, level);
	}

	
	
	
	
	
	
}

