package com.quizzy.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="question",uniqueConstraints={@UniqueConstraint(columnNames="QUESTION_TEXT")})
public class Question implements Serializable {

	
	private static final long serialVersionUID = 805756794398297113L;
	
	Integer question_id;
	
	String question_text;
	
	Set<Answer> question_answers=new HashSet<Answer>(0);

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "QUESTION_ID",unique=true,nullable=false )
	public Integer getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Integer question_id) {
		this.question_id = question_id;
	}

	@Column(name = "QUESTION_TEXT", unique = true, nullable = false, length = 150)
	public String getQuestion_text() {
		return question_text;
	}

	public void setQuestion_text(String question_text) {
		this.question_text = question_text;
	}


	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Answer> getQuestion_answers() {
		return question_answers;
	}

	public void setQuestion_answers(Set<Answer> question_answers) {
		this.question_answers = question_answers;
	}

	
	
	
	
	
	
}

