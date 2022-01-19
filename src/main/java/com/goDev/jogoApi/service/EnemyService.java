package com.goDev.jogoApi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goDev.jogoApi.modelo.Enemy;
import com.goDev.jogoApi.repository.EnemyRepo;

@Transactional
@Service
public class EnemyService {

	@Autowired
	private EnemyRepo repo;
	
	public Enemy addEnemy(Enemy enemy) {
		return repo.save(enemy);
	}
	
	public Enemy updateEnemy(Enemy enemy) {
		return repo.save(enemy);
	}
	
	public List<Enemy> findEnemy() {
		return repo.findAll();
	}
	
	public Enemy findById(Long id) {
		return repo.getById(id);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
