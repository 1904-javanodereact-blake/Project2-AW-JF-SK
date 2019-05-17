package com.geekzilla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekzilla.model.Messages;
import com.geekzilla.model.Users;	
import com.geekzilla.services.MessageServices;

@RestController
@RequestMapping("message")
public class MessageController {
	@Autowired
	private MessageServices messageService;

	
	@PostMapping()
	public Messages save(@RequestBody Messages m) {
		return messageService.save(m);
	}

	@GetMapping("{id}")
	public Messages findByMesId(@PathVariable int id) {
		return messageService.findById(id);

	}
}
