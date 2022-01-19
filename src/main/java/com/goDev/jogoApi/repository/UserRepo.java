package com.goDev.jogoApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goDev.jogoApi.modelo.GameUser;

public interface UserRepo extends JpaRepository<GameUser, Long>{

}
