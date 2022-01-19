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

import com.goDev.jogoApi.modelo.CharacterSprite;
import com.goDev.jogoApi.service.CharacterSpriteService;

@RestController
@RequestMapping("/characterSprite")
public class CharacterSpriteResources {

	@Autowired 
	private CharacterSpriteService service;
	
	@PostMapping
	public ResponseEntity<CharacterSprite> addCharacterSprite(@RequestBody CharacterSprite characterSprite) {
		CharacterSprite newCharacterSprite = service.addCharacterSprite(characterSprite);
		return new ResponseEntity<>(newCharacterSprite, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<CharacterSprite> updateCharacterSprite(@RequestBody CharacterSprite characterSprite) {
		CharacterSprite newCharacterSprite = service.updateCharacterSprite(characterSprite);
		return new ResponseEntity<>(newCharacterSprite, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<CharacterSprite>> findAll() {
		List<CharacterSprite> charactersSprites = service.findCharacterSprite();
		return new ResponseEntity<>(charactersSprites, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CharacterSprite> findById(@PathVariable("id") Long id) {
		CharacterSprite characterSprite = service.findById(id);
		return new ResponseEntity<>(characterSprite, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}
