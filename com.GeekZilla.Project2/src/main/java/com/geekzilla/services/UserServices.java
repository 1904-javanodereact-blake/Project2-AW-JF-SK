package com.geekzilla.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekzilla.model.Users;
import com.geekzilla.repositories.UserRepo;

@Service 
public class UserServices {
	@Autowired 
	private UserRepo userRepo;
	
	public Users findByUserName(String userName) {
		return userRepo.findByUserName(userName);
	}
	
	public Users findById(int userId) {
		return userRepo.getOne(userId);
	}
	
	public Users save(Users m) {
		return userRepo.save(m);
	}
}
