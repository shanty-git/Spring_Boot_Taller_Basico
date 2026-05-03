package com.zapata.dszp_GestionProductos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zapata.dszp_GestionProductos.model.Categoria;
import com.zapata.dszp_GestionProductos.repository.CategoriaRepository;

@Service
public class CategoriaService {

	private final CategoriaRepository repo_cat;

	public CategoriaService(CategoriaRepository repo_cat) {
		this.repo_cat = repo_cat;
	}
	
	public List<Categoria> listarCat(){
		return repo_cat.findAll();
	}
	
	public void agregarCat(Categoria cat){
		repo_cat.save(cat);
	}

	public boolean eliminarCat(Long id){
		
		Categoria existe = repo_cat.findAll().stream().
				filter(u -> id.equals(u.getId_cat())).
				findFirst().orElse(null);

		if (existe != null) {
			repo_cat.delete(id);
			return true;
		}
		
		return false;
	}
}
