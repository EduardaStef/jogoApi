package com.goDev.jogoApi.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Character implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private Integer health;
	
	@Column
	private Integer attack;
	
	@Column
	private Integer defense;
	
	@Column(nullable = false)
	private Integer level;
	
	@Column
	private Integer xp;
	
	@Column(nullable = false)
	private Integer maxHealth;
	
	@ManyToOne
	private GameUser idUser;
	
	public Character() {
		
	};
	
	public Character(Long id, String name, Integer health, Integer attack, Integer defense,
			Integer level, Integer xp, Integer maxHealth, GameUser idUser) {
		super();
		this.id = id;
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.defense = defense;
		this.level = level;
		this.xp = xp;
		this.maxHealth = maxHealth;
		this.idUser = idUser;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

	public Integer getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(Integer maxHealth) {
		this.maxHealth = maxHealth;
	}
	
	public GameUser getIdUser() {
		return idUser;
	}

	public void setIdUser(GameUser idUser) {
		this.idUser = idUser;
	}
	
	
}
