package com.zapata.dszp_GestionLibros.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zapata.dszp_GestionLibros.model.Libro;

@Repository
public class LibroRepository {

	List<Libro> listaLib = new ArrayList<>();

	public LibroRepository() {
	}
	
	public List<Libro> findAll(){
		return listaLib;
	}
	
	public void save(Libro lib) {
		listaLib.add(lib);
	}
}
