package com.zapata.dszp_ConversorTemperaturas.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zapata.dszp_ConversorTemperaturas.model.Temperatura;
import com.zapata.dszp_ConversorTemperaturas.service.TemperaturaService;

@RestController
@RequestMapping("/temperatura")
public class TemperaturaController {
	
	private final TemperaturaService temService;

	public TemperaturaController(TemperaturaService temService) {
		this.temService = temService;
	}
	
	@PostMapping("/convertir")
	public double convertir(@RequestBody Temperatura temp) {
		return temService.calcularTemperatura(temp);
	}
}