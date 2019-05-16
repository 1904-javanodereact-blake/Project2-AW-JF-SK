package com.geekzilla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekzilla.model.MessageRecipient;
import com.geekzilla.model.Messages;

@Repository
public interface MessageRecipientRepo extends JpaRepository<MessageRecipient, Integer> {
	MessageRecipient findById(int id);

}
