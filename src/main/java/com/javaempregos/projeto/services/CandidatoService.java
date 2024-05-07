package com.javaempregos.projeto.services;

import java.util.List;
import com.javaempregos.projeto.entities.Candidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaempregos.projeto.repositories.CandidatoRepository;

@Service
public class CandidatoService {
	
	@Autowired
	private CandidatoRepository repositorio;
	
	public List<Candidato> findAll(){
		return repositorio.findAll();
	}
	
}
