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

import com.goDev.jogoApi.modelo.GameUser;
import com.goDev.jogoApi.service.UserService;

@RestController
@RequestMapping("/user")
public class UserResources {

	@Autowired 
	private UserService service;
	
	@PostMapping
	public ResponseEntity<GameUser> addUser(@RequestBody GameUser user) {
		GameUser newUser = service.addUser(user);
		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<GameUser> updateUser(@RequestBody GameUser user) {
		GameUser newUser = service.updateUser(user);
		return new ResponseEntity<>(newUser, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<GameUser>> findAll() {
		List<GameUser> user = service.findUser();
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<GameUser> findById(@PathVariable("id") Long id) {
		GameUser user = service.findById(id);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}

