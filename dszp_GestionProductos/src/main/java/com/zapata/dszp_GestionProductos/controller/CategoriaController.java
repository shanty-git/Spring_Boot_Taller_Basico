package com.zapata.dszp_GestionProductos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zapata.dszp_GestionProductos.model.Categoria;
import com.zapata.dszp_GestionProductos.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	private final CategoriaService cat_service;

	public CategoriaController(CategoriaService cat_service) {
		this.cat_service = cat_service;
	}
	
	@GetMapping
	public List<Categoria> listarCat(){
		return cat_service.listarCat();
	}
	
	@PostMapping
	public String guardarCat(@RequestBody Categoria cat) {
		cat_service.agregarCat(cat);
		return "Categoria guardada";
	}
	
	@DeleteMapping("/{id}")
	public String eliminarCat(@PathVariable Long id) {
		return cat_service.eliminarCat(id) 
				? "Se elimino la categoria" 
				: "No se encontro la categoria";
	}
}
