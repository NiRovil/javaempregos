package com.javaempregos.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaempregos.projeto.entities.Candidato;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {

}
