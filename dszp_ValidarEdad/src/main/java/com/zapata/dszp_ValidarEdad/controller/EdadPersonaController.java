package com.zapata.dszp_ValidarEdad.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zapata.dszp_ValidarEdad.model.EdadPersona;
import com.zapata.dszp_ValidarEdad.service.EdadPersonaService;

@RestController
@RequestMapping("/edad")
public class EdadPersonaController {

	private final EdadPersonaService edService;

	public EdadPersonaController(EdadPersonaService edService) {
		this.edService = edService;
	}
	
	@GetMapping
	public List<EdadPersona> listaPer() {
		return edService.listaPer();
	}
	
	@PostMapping("/calcular")
	public String edadPersona(@RequestParam String nombre, @RequestParam int edad) {
		return edService.calcularEdadPer(nombre, edad);
	}
}
