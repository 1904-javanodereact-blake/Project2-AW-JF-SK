package com.geekzilla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekzilla.model.Images;
import com.geekzilla.services.ImagesServices;

@RestController
@RequestMapping("images")
public class Imagescontroller {
	@Autowired
	private ImagesServices imageService;

	@PostMapping()
	public Images save(@RequestBody Images i) {
		return imageService.save(i);
	}

	@GetMapping("{id}")
	public Images findById(@PathVariable int id) {
		return imageService.findByImgId(id);
	}

}
