package com.geekzilla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.geekzilla.model.Zillas;
import com.geekzilla.services.ZillasServices;

@RestController
@RequestMapping("zillas")
public class ZillasController {
	@Autowired
	private ZillasServices zillaServices;
//
	@PostMapping()
	public Zillas save(@RequestBody Zillas z) {
		return zillaServices.save(z);
}
	@GetMapping("/{id}")
	public Zillas findById(@PathVariable int id) {
		return zillaServices.findById(id);
		
	}}
	

