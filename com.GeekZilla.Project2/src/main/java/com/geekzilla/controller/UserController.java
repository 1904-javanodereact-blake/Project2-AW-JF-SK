package com.geekzilla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekzilla.model.Users;
import com.geekzilla.services.UserServices;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	private UserServices userServices;


	@GetMapping("username/{username}")
	public Users findByUserName(@PathVariable String username) {
		return userServices.findByUserName(username);
	}
	
	@PostMapping()
	public Users save(@RequestBody Users m) {
		return userServices.save(m);
	}
	@GetMapping("{userId}")
	public Users findById(@PathVariable int userId) {
		return userServices.findById(userId);
		
	}

}
