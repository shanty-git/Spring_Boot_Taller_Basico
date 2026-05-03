package com.zapata.dszp_GestionProductos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zapata.dszp_GestionProductos.model.Categoria;

@Repository
public class CategoriaRepository {

	private List<Categoria> lista_In_Cat = new ArrayList<>();

	public CategoriaRepository() {
	}
	
	public List<Categoria> findAll(){
		return lista_In_Cat;
	}
	
	public void save(Categoria cat) {
		lista_In_Cat.add(cat);
	}
	
	public void delete(Long id) {
		lista_In_Cat.removeIf(u -> u.getId_cat().equals(id));
	}
}
