package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bae.entities.Users;
import com.bae.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository repository;
	private RestTemplate restTemplate;
	
	@Autowired
	public UserServiceImpl(UserRepository repository, RestTemplate restTemplate) {
		this.repository = repository;
		this.restTemplate = restTemplate;
		
	}

	@Override
	public Users createUser(Users user) {
		return repository.save(user);
	}

	@Override
	public ResponseEntity<Object> checkId(String request) {
        
		return  restTemplate.exchange("http://localhost:8081/getPokemon/" + request, HttpMethod.GET, null, Object.class);
		 
	}


}
