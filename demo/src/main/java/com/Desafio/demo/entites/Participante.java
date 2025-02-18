package com.Desafio.demo.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_participantes")

public class Participante {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "atividade_id")
	private Atividade atividade;
	
	public Participante() {
		
	}
	
	public Participante(Integer id, String nome, String email) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		
	}
	
	public Integer getId() {
		return id;
	}
	public Integer setId(Integer id) {
		return this.id = id;
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
	
}

	