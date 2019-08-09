package com.bae.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.entities.Search;
import com.bae.repository.Repository;

@Service
public class AuditorServiceImpl implements AuditorService{

	
	private Repository repository;

	@Autowired
	public AuditorServiceImpl(Repository repository) {

		this.repository = repository;
	}
	
	@Override
	public Collection<Search> getSearches() {
		Collection<Search> newList = repository.findAll();
		return newList;
	}
	}

	
