package com.geekzilla.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.geekzilla.dto.CredentialDto;
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

	public Users login(CredentialDto user) {
		
		return userRepo.findByUserNameAndPassword(user.getUserName(), user.getPassword());
	}

	@GetMapping()
	public List<Users> findAll() {
		return userRepo.findAll();
	}
	
}
