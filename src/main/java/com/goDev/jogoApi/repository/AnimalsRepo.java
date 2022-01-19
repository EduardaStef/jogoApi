package com.goDev.jogoApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goDev.jogoApi.modelo.Animals;

public interface AnimalsRepo extends JpaRepository<Animals, Long>{
	

}
