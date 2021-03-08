package com.danielLaw.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sexo {

	private static final long SerializableUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id_sexo;
	
	private String sexo;

	public long getId_sexo() {
		return id_sexo;
	}

	public void setId_sexo(long id_sexo) {
		this.id_sexo = id_sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public static long getSerializableuid() {
		return SerializableUID;
	}
	
	
	
}
