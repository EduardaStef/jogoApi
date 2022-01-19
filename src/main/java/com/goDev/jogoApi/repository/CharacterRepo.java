package com.goDev.jogoApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goDev.jogoApi.modelo.Character;

public interface CharacterRepo extends JpaRepository<Character, Long>{

}
