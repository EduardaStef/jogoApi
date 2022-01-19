package com.goDev.jogoApi.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "CharacterSprite")
@Table(name = "characterSprite")
public class CharacterSprite implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String walkSideUrl;
	
	@Column
	private String walkFrontUrl;
	
	@Column
	private String walkBackUrl;
	
	@Column
	private String staySideUrl;
	
	@Column
	private String stayFrontUrl;
	
	@Column
	private String stayBackUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public CharacterSprite() {
		
	};

	public CharacterSprite(Long id, String walkSideUrl, String walkFrontUrl, String walkBackUrl, String staySideUrl,
			String stayFrontUrl, String stayBackUrl) {
		super();
		this.id = id;
		this.walkSideUrl = walkSideUrl;
		this.walkFrontUrl = walkFrontUrl;
		this.walkBackUrl = walkBackUrl;
		this.staySideUrl = staySideUrl;
		this.stayFrontUrl = stayFrontUrl;
		this.stayBackUrl = stayBackUrl;
	}

	public String getWalkSideUrl() {
		return walkSideUrl;
	}

	public void setWalkSideUrl(String walkSideUrl) {
		this.walkSideUrl = walkSideUrl;
	}

	public String getWalkFrontUrl() {
		return walkFrontUrl;
	}

	public void setWalkFrontUrl(String walkFrontUrl) {
		this.walkFrontUrl = walkFrontUrl;
	}

	public String getWalkBackUrl() {
		return walkBackUrl;
	}

	public void setWalkBackUrl(String walkBackUrl) {
		this.walkBackUrl = walkBackUrl;
	}

	public String getStaySideUrl() {
		return staySideUrl;
	}

	public void setStaySideUrl(String staySideUrl) {
		this.staySideUrl = staySideUrl;
	}

	public String getStayFrontUrl() {
		return stayFrontUrl;
	}

	public void setStayFrontUrl(String stayFrontUrl) {
		this.stayFrontUrl = stayFrontUrl;
	}

	public String getStayBackUrl() {
		return stayBackUrl;
	}

	public void setStayBackUrl(String stayBackUrl) {
		this.stayBackUrl = stayBackUrl;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
