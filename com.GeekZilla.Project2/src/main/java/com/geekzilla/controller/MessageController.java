package com.geekzilla.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekzilla.model.Messages;
import com.geekzilla.model.Users;

@RestController
@RequestMapping("message")
public class MessageController {
	private Messages message;

	@Autowired
	@PostMapping()
	public Messages save(@RequestBody Messages m) {
		return message.save(m);
	}

	@GetMapping("id")
	public Messages findByMesId(@PathVariable int id) {
		return message.findByMesId(id);

	}
}
