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

import com.goDev.jogoApi.modelo.Enemy;
import com.goDev.jogoApi.service.EnemyService;

@RestController
@RequestMapping("/enemy")
public class EnemyResources {

	@Autowired 
	private EnemyService service;
	
	@PostMapping
	public ResponseEntity<Enemy> addEnemy(@RequestBody Enemy enemy) {
		Enemy newEnemy = service.addEnemy(enemy);
		return new ResponseEntity<>(newEnemy, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Enemy> updateEnemy(@RequestBody Enemy enemy) {
		Enemy newEnemy = service.updateEnemy(enemy);
		return new ResponseEntity<>(newEnemy, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Enemy>> findAll() {
		List<Enemy> enemies = service.findEnemy();
		return new ResponseEntity<>(enemies, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Enemy> findById(@PathVariable("id") Long id) {
		Enemy enemy = service.findById(id);
		return new ResponseEntity<>(enemy, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}

