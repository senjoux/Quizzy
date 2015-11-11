package com.quizzy.entity;

import java.util.HashSet;
import java.util.Set;

public class Question {

	int question_id;
	String question;
	Set<Answer> list_answers=new HashSet<Answer>(0);
	
}

