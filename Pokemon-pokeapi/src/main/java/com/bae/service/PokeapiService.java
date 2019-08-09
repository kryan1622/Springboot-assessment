package com.bae.service;

import org.springframework.http.ResponseEntity;

public interface PokeapiService {

	ResponseEntity<Object> getPokemonByNumber(String number);
	ResponseEntity<Object> getPokemonByName(String name);
}
