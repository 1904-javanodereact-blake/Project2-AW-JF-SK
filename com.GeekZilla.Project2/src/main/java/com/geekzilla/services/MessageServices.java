package com.geekzilla.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekzilla.model.Messages;
import com.geekzilla.repositories.MessagesRepo;

@Service
public class MessageServices {
	@Autowired
	private MessagesRepo messagesRepo;
	
	public Messages findByMesId(int mesId) {
		return messagesRepo.findByMesId(mesId);
	}
	public Messages save(Messages v) {
		return messagesRepo.save(v);
	}
}
