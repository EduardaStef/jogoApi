package com.goDev.jogoApi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goDev.jogoApi.modelo.Npc;
import com.goDev.jogoApi.repository.NpcRepo;

@Transactional
@Service
public class NpcService {

	@Autowired
	private NpcRepo repo;
	
	public Npc addNpc(Npc npc) {
		return repo.save(npc);
	}
	
	public Npc updateNpc(Npc npc) {
		return repo.save(npc);
	}
	
	public List<Npc> findNpc() {
		return repo.findAll();
	}
	
	public Npc findById(Long id) {
		return repo.getById(id);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
