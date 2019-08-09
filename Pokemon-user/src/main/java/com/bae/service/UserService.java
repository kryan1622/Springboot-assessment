package com.bae.service;

import org.springframework.http.ResponseEntity;

import com.bae.entities.Users;

public interface UserService {
	
	Users createUser(Users user);
	ResponseEntity<Object> checkId(String request);

}
