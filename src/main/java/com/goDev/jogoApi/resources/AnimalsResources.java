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

import com.goDev.jogoApi.modelo.Animals;
import com.goDev.jogoApi.service.AnimalsService;

@RestController
@RequestMapping("/animals")
public class AnimalsResources {

	@Autowired
	private AnimalsService service;
	
	@PostMapping
	public ResponseEntity<Animals> addAnimal(@RequestBody Animals animal) {
		Animals newAnimal = service.addAnimal(animal);
		return new ResponseEntity<>(newAnimal, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Animals> updateAnimal(@RequestBody Animals animal) {
		Animals newAnimal = service.updateAnimal(animal);
		return new ResponseEntity<>(newAnimal, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Animals>> findAll() {
		List<Animals> animals = service.findAnimals();
		return new ResponseEntity<>(animals, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Animals> findById(@PathVariable("id") Long id) {
		Animals animal = service.findById(id);
		return new ResponseEntity<>(animal, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}
