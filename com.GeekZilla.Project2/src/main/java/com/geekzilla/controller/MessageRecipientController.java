package com.geekzilla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekzilla.model.MessageRecipient;
import com.geekzilla.services.MessageRecipientServices;

@RestController
@RequestMapping("recievedmessages")
public class MessageRecipientController {
	@Autowired
	private MessageRecipientServices msgrecieve;
	
	@GetMapping("id")
	public MessageRecipient findById(@PathVariable int id) {
		return msgrecieve.findByid(id);
	}
	
	@PostMapping()
	public MessageRecipient save(@RequestBody MessageRecipient r) {
		return msgrecieve.save(r);
	}
}

