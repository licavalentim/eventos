package com.Desafio.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Desafio.demo.dto.AtividadeDTO;

@RestController
@RequestMapping("Atividade")

public class DesafioController {

	@GetMapping
	public List<AtividadeDTO>findAll(){
		return findAll();
	}
		

	}
