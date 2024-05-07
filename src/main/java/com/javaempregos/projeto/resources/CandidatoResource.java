package com.javaempregos.projeto.resources;

import java.util.List;
import com.javaempregos.projeto.entities.Candidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaempregos.projeto.services.CandidatoService;

@RestController
@RequestMapping(value = "/candidatos")
public class CandidatoResource {
	
	@Autowired
	private CandidatoService service;
	
	@GetMapping
	public ResponseEntity<List<Candidato>> findAll(){
		List<Candidato> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
}
