package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bae.entities.SentUser;

public interface Repository extends MongoRepository<SentUser, Long>{

}
