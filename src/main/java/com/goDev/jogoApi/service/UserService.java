package com.goDev.jogoApi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goDev.jogoApi.modelo.GameUser;
import com.goDev.jogoApi.repository.UserRepo;

@Transactional
@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public GameUser addUser(GameUser user) {
		return repo.save(user);
	}
	
	public GameUser updateUser(GameUser user) {
		return repo.save(user);
	}
	
	public List<GameUser> findUser() {
		return repo.findAll();
	}
	
	public GameUser findById(Long id) {
		return repo.getById(id);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
