package com.danielLaw.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado_civil {

	private static final long SerializableUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id_estado_civil;
	
	private String estado_civil;
	

	public long getId_estado_civil() {
		return id_estado_civil;
	}

	public void setId_estado_civil(long id_estado_civil) {
		this.id_estado_civil = id_estado_civil;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public static long getSerializableuid() {
		return SerializableUID;
	}
	
	
	
}
