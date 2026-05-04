package com.zapata.dszp_SaludoPersonalizado.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zapata.dszp_SaludoPersonalizado.model.Persona;
import com.zapata.dszp_SaludoPersonalizado.model.SaludoPer;
import com.zapata.dszp_SaludoPersonalizado.repository.PersonaRepository;

@Service
public class PersonaService {

	private final PersonaRepository repo_p;

	public PersonaService(PersonaRepository repo_p) {
		this.repo_p = repo_p;
	}

	public void agregarPersona(Persona p) {
		repo_p.save(p);
	}
	
	public List<Persona> listarPer(){
		return repo_p.findAll();
	}
	
	public String generarSaludo(String nombre_p) {
			
		Persona p = new Persona();
		p.setNombre_p(nombre_p);
		repo_p.save(p);
		
		String saludo = "Hola " + nombre_p + " Bienvenido a la API de saludos personalizados";
		
		SaludoPer s = new SaludoPer();
		s.setId_saludo(1L);
		s.setTextSaludo(saludo);
			
		return saludo;		
	}
}
