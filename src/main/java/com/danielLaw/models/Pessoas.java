package com.danielLaw.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Pessoas {
	
	private static final long SerializableUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private String cpf;
	private String nome;
	private String email;
	private String dt_nascimento;
	private String sexo;
	private String estado_civil;
	private String status;

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerializableuid() {
		return SerializableUID;
	}
	
	

}
