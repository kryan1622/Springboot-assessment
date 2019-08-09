package com.bae.rest;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entities.Search;
import com.bae.service.AuditorService;

@RestController
public class Controller {

	private AuditorService service;
	
	@Autowired
	public Controller(AuditorService service) {
		this.service = service;
	}
	
	@GetMapping("/getSearchs")
	public Collection<Search> getSearches(){
		return service.getSearches();
	}
}
