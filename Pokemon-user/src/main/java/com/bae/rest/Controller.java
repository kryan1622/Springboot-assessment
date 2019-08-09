package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jms.core.JmsTemplate;

import com.bae.entities.SentUser;
import com.bae.entities.Users;
import com.bae.service.UserService;

@RestController
public class Controller {
	
	private UserService service;
	private JmsTemplate jmsTemplate;
	
	
	@Autowired
	public Controller(UserService service, JmsTemplate jmsTemplate) {
		this.service= service;
		this.jmsTemplate = jmsTemplate;
	}
	
	@PostMapping("/createUser")
	public Users createUser(@RequestBody Users user) {
		sendToQueue(user);
		return service.createUser(user);
	}
	
	@GetMapping("/getPokemon/{userId}/{request}")
	public ResponseEntity<Object> getPokemonByNumber(@PathVariable("userId") Long userId, @PathVariable("request") String request){
		return service.checkId(userId, request);
	}
	
	private void sendToQueue(Users user) {
		SentUser userToStore = new SentUser(user);
		jmsTemplate.convertAndSend("UserQueue", userToStore);
	}

}
