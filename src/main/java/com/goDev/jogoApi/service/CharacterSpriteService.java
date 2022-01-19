package com.goDev.jogoApi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goDev.jogoApi.modelo.CharacterSprite;
import com.goDev.jogoApi.repository.CharacterSpriteRepo;

@Service
@Transactional
public class CharacterSpriteService {

	@Autowired
	CharacterSpriteRepo repo;
	
	public CharacterSprite addCharacterSprite(CharacterSprite characterSprite) {
		return repo.save(characterSprite);
	}
	
	public CharacterSprite updateCharacterSprite(CharacterSprite characterSprite) {
		return repo.save(characterSprite);
	}
	
	public List<CharacterSprite> findCharacterSprite() {
		return repo.findAll();
	}
	
	public CharacterSprite findById(Long id) {
		return repo.getById(id);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
