package com.javaempregos.projeto.entities;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_candidato")
public class Candidato implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String usuario;
    private String nomeCandidato;
    private String pretensaoSalarial;
    private String escolaridade;
    
    public Candidato() {
    	
    }

	public Candidato(Long id, String usuario, String nomeCandidato, String pretensaoSalarial, String escolaridade) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.nomeCandidato = nomeCandidato;
		this.pretensaoSalarial = pretensaoSalarial;
		this.escolaridade = escolaridade;
	}
	
	private Map<String, String> pretensaoSalarial(){
		Map<String, String> salarios = new HashMap<String, String>();
		salarios.put("1K", "Até 1.000");
		salarios.put("2K", "De 1.001 à 2.000");
		salarios.put("3K", "De 2.001 à 3.000");
		salarios.put("4K", "Acima de 3.001");
		return salarios;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public String getPretensaoSalarial() {
		return pretensaoSalarial().get(pretensaoSalarial);
	}

	public void setPretensaoSalarial(String pretensaoSalarial) {
		this.pretensaoSalarial = pretensaoSalarial;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		return Objects.equals(id, other.id);
	}

}
