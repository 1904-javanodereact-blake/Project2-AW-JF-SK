package com.geekzilla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekzilla.model.Users;

@Repository 
public interface UserRepo extends JpaRepository<Users, Integer> {

	Users findByUserName(String userName);
	public Users findByUserNameAndPassword(String userName, String password);
}
