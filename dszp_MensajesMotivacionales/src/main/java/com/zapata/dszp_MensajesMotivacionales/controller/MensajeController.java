package com.zapata.dszp_MensajesMotivacionales.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zapata.dszp_MensajesMotivacionales.service.MensajeService;

@RestController
@RequestMapping("/motivacional")
public class MensajeController {

	private final MensajeService service;

	public MensajeController(MensajeService service) {
		this.service = service;
	}
	
	@GetMapping
	public String mensaje() {
		return service.mensajeAle();
	}
	
}
