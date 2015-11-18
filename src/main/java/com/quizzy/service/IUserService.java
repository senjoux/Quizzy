package com.quizzy.service;

import com.quizzy.entity.User;

public interface IUserService {

	User findUser(Integer userID);
	
	User addUser(Boolean admin,String name, String surname,String email,String password);
	
	User updateUser(Integer userID, User user); 
	
	boolean deleteUser(Integer userID);
	
	User updateUserScore(Integer userID,double score);
	
}
