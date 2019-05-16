package com.geekzilla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.geekzilla.model.Messages;

@Repository
public interface MessagesRepo extends JpaRepository<Messages, Integer>{

	Messages findByMesId(Integer mesId);
	Messages findByMesId(int id);
}
