package com.goDev.jogoApi.modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity(name = "Dialogue")
@Table(name = "dialogue")
public class Dialogue implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Npc idNpc;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Enemy idEnemy;
	
	@Column(nullable = false)
	private String dialogue;
	
	

	public Dialogue(Long id, Npc idNpc, Enemy idEnemy, String dialogue) {
		super();
		this.id = id;
		this.idNpc = idNpc;
		this.idEnemy = idEnemy;
		this.dialogue = dialogue;
	}
	
public Dialogue() {
		
	};

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Npc getIdNpc() {
		return idNpc;
	}

	public void setIdNpc(Npc idNpc) {
		this.idNpc = idNpc;
	}

	public Enemy getIdEnemy() {
		return idEnemy;
	}

	public void setIdEnemy(Enemy idEnemy) {
		this.idEnemy = idEnemy;
	}

	public String getDialogue() {
		return dialogue;
	}

	public void setDialogue(String dialogue) {
		this.dialogue = dialogue;
	}
	
	
}
