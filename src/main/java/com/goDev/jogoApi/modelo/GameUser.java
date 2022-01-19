package com.goDev.jogoApi.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "GameUser")
@Table(name = "gameUser")
public class GameUser implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public GameUser() {
		
	};
	
	public GameUser(Long id, String username, String userPassword, String bio, String imageUrl, Integer coins) {
		super();
		this.id = id;
		this.username = username;
		this.userPassword = userPassword;
		this.bio = bio;
		this.imageUrl = imageUrl;
		this.coins = coins;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false)
	private String userPassword;
	
	@Column
	private String bio;
	
	@Column
	private String imageUrl;
	
	@Column
	private Integer coins;
	
	@OneToMany
	private List<Character> characters;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getCoins() {
		return coins;
	}

	public void setCoins(Integer coins) {
		this.coins = coins;
	}
	
	
}
