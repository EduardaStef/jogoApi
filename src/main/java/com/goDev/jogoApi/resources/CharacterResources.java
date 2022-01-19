package com.goDev.jogoApi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.goDev.jogoApi.modelo.Character;

import com.goDev.jogoApi.service.CharacterService;

@RestController
@RequestMapping("/character")
public class CharacterResources {

	@Autowired 
	private CharacterService service;
	
	@PostMapping
	public ResponseEntity<Character> addCharacter(@RequestBody Character character) {
		Character newCharacter = service.addCharacter(character);
		return new ResponseEntity<>(newCharacter, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Character> updateCharacter(@RequestBody Character character) {
		Character newCharacter = service.updateCharacter(character);
		return new ResponseEntity<>(newCharacter, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Character>> findAll() {
		List<Character> characters = service.findCharacters();
		return new ResponseEntity<>(characters, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Character> findById(@PathVariable("id") Long id) {
		Character character = service.findById(id);
		return new ResponseEntity<>(character, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}
