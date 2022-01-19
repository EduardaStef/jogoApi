package com.goDev.jogoApi.modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Enemy")
@Table(name = "enemy")
public class Enemy implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Integer health;
	
	@Column
	private Integer attack;
	
	@Column
	private Integer defense;
	
	@Column(nullable = false)
	private String name;
	
	@Column 
	private String description;
	
	@Column
	private Integer xpWhenKilled;
	
	@Column(nullable = false)
	private Integer level;
	
	@OneToOne
	private CharacterSprite idSprite;
	
	@Column(nullable = false)
	private Integer maxHealth;
	
	@OneToMany(mappedBy = "enemy", cascade = CascadeType.ALL)
	private List<Dialogue> dialogues;

	public Enemy() {
		
	};
	
	public Enemy(Long id, Integer health, Integer attack, Integer defense, String name, String description,
			Integer xpWhenKilled, Integer level, CharacterSprite idSprite, Integer maxHealth) {
		super();
		this.id = id;
		this.health = health;
		this.attack = attack;
		this.defense = defense;
		this.name = name;
		this.description = description;
		this.xpWhenKilled = xpWhenKilled;
		this.level = level;
		this.idSprite = idSprite;
		this.maxHealth = maxHealth;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}
	
	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getXpWhenKilled() {
		return xpWhenKilled;
	}

	public void setXpWhenKilled(Integer xpWhenKilled) {
		this.xpWhenKilled = xpWhenKilled;
	}

	public CharacterSprite getIdSprite() {
		return idSprite;
	}

	public void setIdSprite(CharacterSprite idSprite) {
		this.idSprite = idSprite;
	}

	public Integer getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(Integer maxHealth) {
		this.maxHealth = maxHealth;
	}
	
	
}
