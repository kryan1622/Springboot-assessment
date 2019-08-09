package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bae.entities.Search;

public interface Repository extends MongoRepository<Search, Long>{

}
