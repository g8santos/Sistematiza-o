package com.aula.entregadores.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aula.entregadores.models.EntregadorModel;
import com.aula.entregadores.repositories.EntregadorRepository;

import EntregadoresDto.EntregadorDto;
import jakarta.validation.Valid;

@RestController
public class EntregadoresController {
	
	
	@Autowired
	EntregadorRepository entregadorRepository;
	
	@GetMapping("/entregadores")
	public ResponseEntity<List<EntregadorModel>> listar (){
		List<EntregadorModel> entregadorList = entregadorRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(entregadorList);
	}
	@GetMapping("/entregadores/{id}")
	public ResponseEntity<Object> detalhar(@PathVariable(value="id") Integer id){
		Optional<EntregadorModel> entregador = entregadorRepository.findById(id);
		if(entregador.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entregador não encontrado.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(entregador.get());
	}
	
	@DeleteMapping("/entregadores/{id}")
	public ResponseEntity<Object> deleteProduct(@PathVariable(value="id") Integer id) {
		Optional<EntregadorModel> entregador = entregadorRepository.findById(id);
		if(entregador.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entregador não encontrado para exclusão.");
		}
		entregadorRepository.delete(entregador.get());
		return ResponseEntity.status(HttpStatus.OK).body("O entregador foi excluído.");
	}
	
	@PutMapping("/entregadores/{id}")
	public ResponseEntity<Object> updateProduct(@PathVariable(value="id") Integer id,
													  @RequestBody @Valid EntregadorDto entregadorDto) {
		Optional<EntregadorModel> filme = entregadorRepository.findById(id);
		if(entregador.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entregador não encontrado para edição.");
		}
		var entregadorModel = entregador.get();
		BeanUtils.copyProperties(entregadorDto, entregadorModel);
		return ResponseEntity.status(HttpStatus.OK).body(entregadorRepository(entregadorModel));
	}
	private Object entregadorRepository(Object entregadorModel) {
		// TODO Auto-generated method stub
		return null;
	}
}
