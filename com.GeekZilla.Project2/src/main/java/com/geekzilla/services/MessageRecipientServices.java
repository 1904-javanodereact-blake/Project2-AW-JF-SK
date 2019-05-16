package com.geekzilla.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekzilla.model.MessageRecipient;
import com.geekzilla.repositories.MessageRecipientRepo;

@Service
public class MessageRecipientServices {

	@Autowired
	private MessageRecipientRepo messageRecipientRepo;
	
	public MessageRecipient findByid(int id) {
		// TODO Auto-generated method stub
		return messageRecipientRepo.getOne(id);
	}

	public MessageRecipient save(MessageRecipient m) {
		return messageRecipientRepo.save(m);
	}
}

	