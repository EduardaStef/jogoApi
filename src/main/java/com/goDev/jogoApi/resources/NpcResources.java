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

import com.goDev.jogoApi.modelo.Npc;
import com.goDev.jogoApi.service.NpcService;

@RestController
@RequestMapping("/npc")
public class NpcResources {

	@Autowired 
	private NpcService service;
	
	@PostMapping
	public ResponseEntity<Npc> addNpc(@RequestBody Npc npc) {
		Npc newNpc = service.addNpc(npc);
		return new ResponseEntity<>(newNpc, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Npc> updateNpc(@RequestBody Npc npc) {
		Npc newNpc = service.updateNpc(npc);
		return new ResponseEntity<>(newNpc, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Npc>> findAll() {
		List<Npc> npc = service.findNpc();
		return new ResponseEntity<>(npc, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Npc> findById(@PathVariable("id") Long id) {
		Npc npc = service.findById(id);
		return new ResponseEntity<>(npc, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}

