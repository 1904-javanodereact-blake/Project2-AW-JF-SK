package com.geekzilla.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekzilla.model.Messages;

@RestController
@RequestMapping("message")
public class MessageController {
	List<Messages> message = new ArrayList<>();
	
	@PostMapping()
	public Messages save(@RequestBody Messages m) {
		m.setId((int) Math.round(Math.random() * 1000000));
		message.add(m);
		return m;
	}
	@GetMapping("id")
	public Messages findById(@PathVariable int id) {
		return message.stream().filter(message -> message.getId() == id).findFirst().get();
		
	}
}
