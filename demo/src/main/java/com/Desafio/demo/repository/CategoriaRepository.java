package com.Desafio.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Desafio.demo.entites.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{

}
