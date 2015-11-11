package com.quizzy.entity;

import java.util.HashSet;
import java.util.Set;

public class User {

	int user_id;
	boolean is_admin;
	String nom;
	String prenom;
	String email;
	String password;
	Set<User_Answer> list_answers=new HashSet<User_Answer>(0);
	Set<Result> user_results=new HashSet<Result>(0);

}
