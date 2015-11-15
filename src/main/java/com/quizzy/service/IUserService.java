package com.quizzy.service;

import com.quizzy.entity.User;

public interface IUserService {

	User addUser(Boolean admin,String name, String surname,String email,String password);
	
	User updateUser(Integer user_id, User user); 
	
	void deleteUser(Integer user_id);
	
	void updateUserScore(Integer user_id,Double x);
	
}
