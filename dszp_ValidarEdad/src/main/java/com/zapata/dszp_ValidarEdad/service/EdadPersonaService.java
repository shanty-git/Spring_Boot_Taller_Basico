package com.zapata.dszp_ValidarEdad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zapata.dszp_ValidarEdad.model.EdadPersona;
import com.zapata.dszp_ValidarEdad.repository.EdadPersonaRepository;

@Service
public class EdadPersonaService {

	private final EdadPersonaRepository repoEd;

	public EdadPersonaService(EdadPersonaRepository repoEd) {
		this.repoEd = repoEd;
	}
	
	public List<EdadPersona> listaPer() {
		return repoEd.findAll();
	}
	
	public String calcularEdadPer(String nombre, int edad) {
		
		EdadPersona persona = new EdadPersona(nombre, edad);
	    repoEd.save(persona);
		
		if(edad >= 0 && edad < 18) {
			
			return nombre+ " Es menor de edad";
		
		}else if(edad >= 18) {
		
			return nombre + " Es mayor de edad";
		
		}else {
			
			return "La edad ingresada no es calculable";
		
		}
	}
}
