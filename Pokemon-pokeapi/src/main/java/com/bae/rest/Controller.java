package com.bae.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.bae.service.PokeapiService;

@RestController
public class Controller {

	private PokeapiService service;

	
	@Autowired
	public Controller(PokeapiService service) {
		this.service = service;
	}
	
	
	@GetMapping("/getPokemon/{request}")
	public ResponseEntity<Object> getPokemonByNumber(@PathVariable("request") String request){
		return service.getPokemon(request);
	}
	
	
}
