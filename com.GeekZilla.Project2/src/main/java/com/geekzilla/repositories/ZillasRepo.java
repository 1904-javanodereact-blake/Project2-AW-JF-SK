package com.geekzilla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekzilla.model.Zillas;

@Repository
public interface ZillasRepo extends JpaRepository<Zillas, Integer> {
	
//	Zillas findByPost_Id(int post_id);
//	Zillas findByUser_Id(int user_id);
}
