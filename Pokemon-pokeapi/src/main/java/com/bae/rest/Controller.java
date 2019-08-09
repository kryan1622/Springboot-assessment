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
	
	
	@GetMapping("/getPokeByNumber/{number}")
	public ResponseEntity<Object> getPokemonByNumber(@PathVariable("number") String number){
		return service.getPokemonByNumber(number);
	}
	
	@GetMapping("/getPokeByName/{name}")
	public ResponseEntity<Object> getPokemonByName(@PathVariable("name") String name){
		return service.getPokemonByNumber(name);
	}
}
