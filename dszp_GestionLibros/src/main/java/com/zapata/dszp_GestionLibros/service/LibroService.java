package com.zapata.dszp_GestionLibros.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zapata.dszp_GestionLibros.model.Libro;
import com.zapata.dszp_GestionLibros.repository.LibroRepository;

@Service
public class LibroService {

	private final LibroRepository repoLib;

	public LibroService(LibroRepository repoLib) {
		this.repoLib = repoLib;
	}
	
	public List<Libro> listaLibros(){
		return repoLib.findAll();
	}
	
	public void guardarLib(Libro lib) {
		repoLib.save(lib);
	}
	
	public List<Libro> buscarAutor(String nom){
		List<Libro> existe = repoLib.findAll().stream().filter(u -> nom.equals(u.getAutor())).toList();
		return existe;
	}
}
