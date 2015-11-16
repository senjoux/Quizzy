package com.quizzy.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizzy.entity.User;
import com.quizzy.repository.IUserRepo;
import com.quizzy.service.IUserService;

@Service
public class UserService implements IUserService{
	@Autowired
	IUserRepo userRepo;
	
	public User addUser(Boolean admin, String name, String surname,
			String email, String password) {
		User u=new User(admin, name, surname, email, password);
		u.setScore((double) 0);
	return	userRepo.save(u);	
	}

	public void deleteUser(Integer user_id){
		userRepo.delete(user_id);
	}

	public User updateUser(Integer user_id, User user) {
		User temp=userRepo.findOne(user_id);
		temp.setAdmin(user.isAdmin());
		temp.setName(user.getName());
		temp.setSurname(user.getSurname());
		temp.setEmail(user.getEmail());
		temp.setPassword(user.getPassword());
		
		return temp;
	}

	public void updateUserScore(Integer user_id,Double x) {
		User temp=userRepo.findOne(user_id);
		Double y=temp.getScore();
		temp.setScore(y+x);
	}
	
	
}
