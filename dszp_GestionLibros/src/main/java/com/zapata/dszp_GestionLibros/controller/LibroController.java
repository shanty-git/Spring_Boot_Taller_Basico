package com.zapata.dszp_GestionLibros.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zapata.dszp_GestionLibros.model.Libro;
import com.zapata.dszp_GestionLibros.service.LibroService;

@RestController
@RequestMapping("/libro")
public class LibroController {

	private final LibroService libService;

	public LibroController(LibroService libService) {
		this.libService = libService;
	}
	
	@GetMapping
	public List<Libro> listarLibros(){
		return libService.listaLibros();
	}
	
	@GetMapping("/{nombre}")
	public List<Libro> librosAutor(@PathVariable String nombre){
		return libService.buscarAutor(nombre);
	}
	
	@PostMapping
	public String crearLibro(@RequestBody Libro lib) {
		libService.guardarLib(lib);
		return "Libro guardado";
	}
}
