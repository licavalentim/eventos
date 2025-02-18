package com.Desafio.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Desafio.demo.entites.Participante;

	public interface ParticipanteRepository extends JpaRepository<Participante,Integer>{ 

}
