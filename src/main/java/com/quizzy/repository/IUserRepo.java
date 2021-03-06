package com.quizzy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.quizzy.entity.User;

public interface IUserRepo extends CrudRepository<User, Integer> {

	
	List<User> findByName(String name);
	List<User> findByNameLike(String name);
	
	List<User> findBySurname(String surname);
	List<User> findBySurnameLike(String surname);

	List<User> findByEmailLike(String email);
	List<User> findByEmail(String email);
	
	List<User> findByAdminIsTrue();
	List<User> findByAdminIsFalse();
	
	

}
