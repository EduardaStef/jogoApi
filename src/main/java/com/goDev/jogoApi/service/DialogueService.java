package com.goDev.jogoApi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goDev.jogoApi.modelo.Dialogue;
import com.goDev.jogoApi.repository.DialogueRepo;

@Transactional
@Service
public class DialogueService {

	@Autowired
	private DialogueRepo repo;
	
	public Dialogue addDialogue(Dialogue dialogue) {
		return repo.save(dialogue);
	}
	
	public Dialogue updateDialogue(Dialogue dialogue) {
		return repo.save(dialogue);
	}
	
	public List<Dialogue> findDialogue() {
		return repo.findAll();
	}
	
	public Dialogue findById(Long id) {
		return repo.getById(id);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
