package com.goDev.jogoApi.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animals implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String specie;
	
	@Column(nullable = false)
	private Integer level;
	
	@Column
	private Integer xpWhenKilled;
	
	@Column
	private Integer attack;
	
	@Column
	private Integer defense;
	
	@Column
	private Integer health;
	
	public Animals() {
		
	};
	
	public Animals(Long id, String specie, Integer level, Integer xpWhenKilled, Integer attack, Integer defense,
			Integer health) {
		super();
		this.id = id;
		this.specie = specie;
		this.level = level;
		this.xpWhenKilled = xpWhenKilled;
		this.attack = attack;
		this.defense = defense;
		this.health = health;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getXpWhenKilled() {
		return xpWhenKilled;
	}

	public void setXpWhenKilled(Integer xpWhenKilled) {
		this.xpWhenKilled = xpWhenKilled;
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

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}
	

}
