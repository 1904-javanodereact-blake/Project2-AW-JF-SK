package com.geekzilla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geekzilla.model.Zillas;

@Repository
public interface ZillasRepo extends JpaRepository<Zillas, Integer> {
	
}
