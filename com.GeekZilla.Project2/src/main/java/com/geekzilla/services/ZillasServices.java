package com.geekzilla.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekzilla.model.Zillas;
import com.geekzilla.repositories.ZillasRepo;

@Service
public class ZillasServices {
	@Autowired
	private ZillasRepo zillasRepo;
	
	public Zillas findById(int id) {
		return zillasRepo.getOne(id);
	}
	
	public Zillas save(Zillas z) {
		return zillasRepo.save(z);
	}
}