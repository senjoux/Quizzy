package com.quizzy.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
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

@Entity
@Table(name="user")
public class User implements Serializable{

	
	private static final long serialVersionUID = -8395567922919902696L;
	
	
	private Integer userID;
	
	private boolean admin;
	
	private String name;
	
	private String surname;
	
	private String email;
	
	private String password;
	
	private double score;
	
	private Set<UserAnswer> userAnswers=new HashSet<UserAnswer>(0);
	
	private Set<Result> userResults=new HashSet<Result>(0);
	
	

	public User(){}
	
	public User(boolean admin, String name, String surname, String email, String password) {
		this.admin = admin;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		//this.score = (double) 0;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "USER_ID",unique=true,nullable=false )
	public Integer getuserID() {
		return userID;
	}
	public void setuserID(Integer userID) {
		this.userID = userID;
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
	public void setName(String name) {
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

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user",cascade=CascadeType.ALL)
	public Set<UserAnswer> getUserAnswers() {
		return userAnswers;
	}
	public void setUserAnswers(Set<UserAnswer> userAnswers) {
		this.userAnswers = userAnswers;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user",cascade=CascadeType.ALL)
	public Set<Result> getUserResults() {
		return userResults;
	}
	public void setUserResults(Set<Result> userResults) {
		this.userResults = userResults;
	}

	@Column(name = "SCORE",  nullable = false)
	public double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof User)) {
			return false;
		}
		User castOther = (User) other;
		return  Objects.equals(name, castOther.name)
				&& Objects.equals(surname, castOther.surname)
				&& Objects.equals(email, castOther.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userID, name, surname, email);
	}

	@Override
	public String toString() {
		return "User [user_id=" + userID + ", admin=" + admin + ", name="
				+ name + ", surname=" + surname + ", email=" + email
				+ ", password=" + password + ", score=" + score + "]";
	}

	
	
	
	
}
