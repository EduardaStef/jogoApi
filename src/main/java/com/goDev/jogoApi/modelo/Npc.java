package com.goDev.jogoApi.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Npc")
@Table(name = "npc")
public class Npc implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;

	@Column
	private String description;
	
	@OneToOne
	private CharacterSprite idSprite;
	
	@OneToMany
	private List<Dialogue> dialogues;

	public Npc(Long id, String name, String description, CharacterSprite idSprite) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.idSprite = idSprite;
	}
	
	public Npc() {
		
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CharacterSprite getIdSprite() {
		return idSprite;
	}

	public void setIdSprite(CharacterSprite idSprite) {
		this.idSprite = idSprite;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
