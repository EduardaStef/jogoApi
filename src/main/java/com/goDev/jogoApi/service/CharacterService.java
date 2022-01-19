package com.goDev.jogoApi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goDev.jogoApi.modelo.Character;
import com.goDev.jogoApi.repository.CharacterRepo;

@Service
@Transactional
public class CharacterService {

	@Autowired
	private CharacterRepo repo;
	
	public Character addCharacter(Character character) {
		return repo.save(character);
	}
	
	public Character updateCharacter(Character character) {
		return repo.save(character);
	}
	
	public List<Character> findCharacters() {
		return repo.findAll();
	}
	
	public Character findById(Long id) {
		return repo.getById(id);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
