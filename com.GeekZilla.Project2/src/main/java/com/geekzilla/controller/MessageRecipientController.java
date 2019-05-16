package com.geekzilla.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekzilla.model.MessageRecipient;

@RestController
@RequestMapping("recievedmessages")
public class MessageRecipientController {
	List<MessageRecipient> msgrecieve = new ArrayList<>();
	
	@GetMapping("id")
	public MessageRecipient findById(@PathVariable int id) {
		return msgrecieve.stream().filter(msgrecieve -> msgrecieve.getId() == id).findFirst().get();
		
	}
}
