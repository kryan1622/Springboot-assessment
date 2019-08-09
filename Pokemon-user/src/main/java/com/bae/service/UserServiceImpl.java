package com.bae.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.entities.Users;
import com.bae.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	public UserRepository repository;
	
	@Autowired
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public Users createUser(Users user) {
		return repository.save(user);
	}

}
