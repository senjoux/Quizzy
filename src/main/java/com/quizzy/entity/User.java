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

@Entity
@Table(name="user")
public class User implements Serializable{

	
	private static final long serialVersionUID = -8395567922919902696L;
	
	
	Integer user_id;
	
	boolean admin;
	
	String name;
	
	String surname;
	
	String email;
	
	String password;
	
	Set<User_Answer> user_questions_answers=new HashSet<User_Answer>(0);
	
	Set<Result> user_results=new HashSet<Result>(0);
	
	Double score;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "USER_ID",unique=true,nullable=false )
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	@Column(name = "IS_ADMIN",  nullable = false)
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	@Column(name = "NAME", unique = false, nullable = false, length = 20)
	public String getName() {
		return name;
	}
	public void setNom(String name) {
		this.name = name;
	}

	@Column(name = "SURNAME", unique = false, nullable = false, length = 20)
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Column(name = "EMAIL", unique = false, nullable = false, length = 30)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PASSWORD", unique = false, nullable = false, length = 40)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<User_Answer> getUser_questions_answers() {
		return user_questions_answers;
	}
	public void setUser_questions_answers(Set<User_Answer> user_questions_answers) {
		this.user_questions_answers = user_questions_answers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Result> getUser_results() {
		return user_results;
	}
	public void setUser_results(Set<Result> user_results) {
		this.user_results = user_results;
	}

	@Column(name = "SCORE",  nullable = false)
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	
	
}
