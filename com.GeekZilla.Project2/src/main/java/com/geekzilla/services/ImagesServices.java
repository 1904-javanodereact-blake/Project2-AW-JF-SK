package com.geekzilla.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekzilla.model.Images;
import com.geekzilla.repositories.ImagesRepo;

@Service
public class ImagesServices {

	@Autowired
	private ImagesRepo imagesRepo;
	
	public Images findByImgId(Integer imgid) {
		return imagesRepo.findByImgId(imgid);
	}
	public Images save(Images b) {
		return imagesRepo.save(b);
	}
}
