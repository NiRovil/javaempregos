package com.javaempregos.projeto.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import com.javaempregos.projeto.entities.Candidato;
import com.javaempregos.projeto.repositories.CandidatoRepository;

@Configuration
public class CandidatoConfig implements CommandLineRunner{
	
	@Autowired
	private CandidatoRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		Candidato u1 = new Candidato(null, "usuario", "nome", "1K", "Escolaridade");
		Candidato u2 = new Candidato(null, "usuario1", "nome1", "1K", "Escolaridade1");
		repo.saveAll(Arrays.asList(u1, u2));
	}
	
}
