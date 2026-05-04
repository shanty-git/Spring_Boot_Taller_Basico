package com.zapata.dszp_SaludoPersonalizado.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zapata.dszp_SaludoPersonalizado.model.Persona;
import com.zapata.dszp_SaludoPersonalizado.service.PersonaService;

@RestController
@RequestMapping("/mensajes")
public class PersonaController {

	private final PersonaService p_service;

	public PersonaController(PersonaService p_service) {
		this.p_service = p_service;
	}
	
	@GetMapping
	public List<Persona> listarPersonas(){
		return p_service.listarPer();
	}
	
	@GetMapping("/{nombre}")
	public String personaSal(@PathVariable("nombre") String nombre_p) {
		return p_service.generarSaludo(nombre_p);
	}
}
