package com.quizzy.repository.impl;

import java.util.List;

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

	public boolean deleteUser(Integer userID){
		userRepo.delete(userID);
		User temp=userRepo.findOne(userID);
		if(temp!=null){
			return false;
		}
		return true;
	}

	public User updateUser(Integer userID, User user) {
		User temp=userRepo.findOne(userID);
		temp.setAdmin(user.isAdmin());
		temp.setName(user.getName());
		temp.setSurname(user.getSurname());
		temp.setEmail(user.getEmail());
		temp.setPassword(user.getPassword());
		
		return userRepo.save(temp);
	}

	public User updateUserScore(Integer userID,double x) {
		User temp=userRepo.findOne(userID);
		double y=temp.getScore();
		temp.setScore(y+x);
		return userRepo.save(temp);
	}
	
	public User findUser(Integer userID) {
		return userRepo.findOne(userID);
	}
	
	public List<User> findByName(String name){
		return userRepo.findByName(name);
	}
	
	public List<User> findByNameLike(String name){
		return userRepo.findByNameLike(name);
	}
	
	public List<User> findBySurname(String surname){
		return userRepo.findBySurname(surname);
	}
	
	public List<User> findBySurnameLike(String surname){
		return userRepo.findBySurnameLike(surname);
	}
	
	public List<User> findByEmailLike(String email){
		return userRepo.findByEmailLike(email);
	}
	
	public List<User> findByEmail(String email){
		return userRepo.findByEmail(email);
	}
	
	public List<User> findByAdminIsTrue(){
		return userRepo.findByAdminIsTrue();
	}
	
	public List<User> findByAdminIsFalse(){
		return userRepo.findByAdminIsFalse();
	}

	
}
