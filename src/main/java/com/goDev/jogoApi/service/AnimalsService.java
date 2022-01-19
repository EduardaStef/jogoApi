package com.goDev.jogoApi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goDev.jogoApi.modelo.Animals;
import com.goDev.jogoApi.repository.AnimalsRepo;

@Service
@Transactional
public class AnimalsService {
	
	@Autowired 
	private AnimalsRepo repo;
	
	public Animals addAnimal(Animals animal) {
		return repo.save(animal);
	}
	
	public Animals updateAnimal(Animals animal) {
		return repo.save(animal);
	}
	
	public List<Animals> findAnimals() {
		return repo.findAll();
	}
	
	public Animals findById(Long id) {
		return repo.getById(id);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
