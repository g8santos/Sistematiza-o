package com.aula.entregadores.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.entregadores.models.EntregadorModel;
import com.aula.entregadores.repositories.EntregadorRepository;

@RestController
public class EntregadoresController {
	
	
	@Autowired
	EntregadorRepository entregadorRepository;
	
	@GetMapping("/entregadores")
	public ResponseEntity<List<EntregadorModel>> listar (){
		List<EntregadorModel> entregadorList = entregadorRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(entregadorList);
	}
}
