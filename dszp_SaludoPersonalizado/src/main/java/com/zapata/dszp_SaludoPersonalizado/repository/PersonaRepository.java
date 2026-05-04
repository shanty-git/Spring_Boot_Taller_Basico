package com.zapata.dszp_SaludoPersonalizado.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zapata.dszp_SaludoPersonalizado.model.Persona;

@Repository
public class PersonaRepository {

	private List<Persona> lista = new ArrayList<>();

	public PersonaRepository() {
	}
	
	public List<Persona> findAll(){
		return lista;
	}
	
	public void save(Persona p) {
		lista.add(p);
	}
}
