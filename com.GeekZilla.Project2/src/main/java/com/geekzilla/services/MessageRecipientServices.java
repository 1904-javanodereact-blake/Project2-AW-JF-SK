package com.geekzilla.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekzilla.model.MessageRecipient;
import com.geekzilla.repositories.MessageRecipientRepo;

@Service
public class MessageRecipientServices {

	
	@Autowired
	private MessageRecipientRepo messageRecipientRepo;
	public MessageRecipient findByMesId(Integer id) {
		return messageRecipientRepo.findByMesId(id);
	}
	public MessageRecipient save(MessageRecipient m) {
		return messageRecipientRepo.save(m);
	}
}

	