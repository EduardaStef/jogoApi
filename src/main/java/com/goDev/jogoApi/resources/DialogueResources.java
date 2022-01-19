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

import com.goDev.jogoApi.modelo.Dialogue;
import com.goDev.jogoApi.service.DialogueService;

@RestController
@RequestMapping("/dialogue")
public class DialogueResources {


	@Autowired 
	private DialogueService service;
	
	@PostMapping
	public ResponseEntity<Dialogue> addCharacterSprite(@RequestBody Dialogue dialog) {
		Dialogue newDialogue = service.addDialogue(dialog);
		return new ResponseEntity<>(newDialogue, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Dialogue> updateCharacterSprite(@RequestBody Dialogue dialog) {
		Dialogue newDialogue = service.updateDialogue(dialog);
		return new ResponseEntity<>(newDialogue, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Dialogue>> findAll() {
		List<Dialogue> dialogues = service.findDialogue();
		return new ResponseEntity<>(dialogues, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Dialogue> findById(@PathVariable("id") Long id) {
		Dialogue dialogue = service.findById(id);
		return new ResponseEntity<>(dialogue, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}

