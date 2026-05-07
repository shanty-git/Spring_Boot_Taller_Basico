package com.zapata.dszp_ValidarEdad.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zapata.dszp_ValidarEdad.model.EdadPersona;

@Repository
public class EdadPersonaRepository {

	private List<EdadPersona> listaEdPer = new ArrayList<>();

	public EdadPersonaRepository() {
	} 
	
	public List<EdadPersona> findAll(){
		return listaEdPer;
	}
	
	public void save(EdadPersona ed) {
		listaEdPer.add(ed);
	}
}
