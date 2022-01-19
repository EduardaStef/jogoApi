package com.goDev.jogoApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goDev.jogoApi.modelo.Enemy;

public interface EnemyRepo extends JpaRepository<Enemy, Long>{

}
