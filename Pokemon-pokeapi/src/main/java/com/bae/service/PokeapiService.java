package com.bae.service;

import org.springframework.http.ResponseEntity;

public interface PokeapiService {

	ResponseEntity<Object> getPokemon(String request);

}
