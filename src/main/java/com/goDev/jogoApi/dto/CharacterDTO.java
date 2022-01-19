package com.goDev.jogoApi.dto;

import com.goDev.jogoApi.modelo.CharacterSprite;
import com.goDev.jogoApi.modelo.GameUser;

public class CharacterDTO {
	
	public Integer health;
	
	public Long id;
	
	public Integer attack;
	
	public Integer defense;
	
	public CharacterSprite characterSprite;

	public Integer level;
	
	public Integer xp;
	
	public String name;
	
	public Integer maxHealth;
	
	public GameUser idUser;
}
