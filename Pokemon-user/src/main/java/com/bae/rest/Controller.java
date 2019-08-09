package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entities.Users;
import com.bae.service.UserService;

@RestController
public class Controller {
	
	public UserService service;
	
	@Autowired
	public Controller(UserService service) {
		this.service= service;
	}
	
	@PostMapping("/createUser")
	public Users createUser(@RequestBody Users user) {
		return service.createUser(user);
	}

}
