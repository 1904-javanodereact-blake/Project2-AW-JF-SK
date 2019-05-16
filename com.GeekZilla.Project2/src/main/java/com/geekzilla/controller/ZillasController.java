package com.geekzilla.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekzilla.model.Users;
import com.geekzilla.model.Zillas;

@RestController
@RequestMapping("zillas")
public class ZillasController {

	List<Zillas> zilla = new ArrayList<>();
//
	@PostMapping()
	public Zillas save(@RequestBody Zillas z) {
		
}
	@GetMapping("id")
	public Users findById(@PathVariable int id) {
		return userServices.findByUserId(id);
		
	}}

}
