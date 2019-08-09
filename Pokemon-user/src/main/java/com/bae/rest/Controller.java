package com.bae.rest;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jms.core.JmsTemplate;

import com.bae.entities.Search;
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
		sendUserToQueue(user);
		return service.createUser(user);
	}
	
	@GetMapping("/getPokemon/{userId}/{request}")
	public ResponseEntity<Object> getPokemonByNumber(@PathVariable("userId") Long userId, @PathVariable("request") String request, Date date){
		 sendSearchToQueue(userId, request, date);
		return service.checkId(userId, request);
	}
	
	private void sendUserToQueue(Users user) {
		SentUser userToStore = new SentUser(user);
		jmsTemplate.convertAndSend("UserQueue", userToStore);
	}
	
	private void sendSearchToQueue(Long userId,  String request, Date date) {
		Search searchToStore = new Search(service.findById(userId), request, date);
		jmsTemplate.convertAndSend("UserQueue", searchToStore);
	}
	


}
