package com.zapata.dszp_ConversionMoneda.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zapata.dszp_ConversionMoneda.model.Moneda;
import com.zapata.dszp_ConversionMoneda.service.MonedaService;

@RestController
@RequestMapping("/moneda")
public class MonedaController {

	private final MonedaService monService;
	
	public MonedaController(MonedaService monService) {
		this.monService = monService;
	}

	@GetMapping
	public List<Moneda> listaMon(){
		return monService.listaMoneda();
	}
	
	@PostMapping
	public String convertir(@RequestBody Double dolar) {
		return monService.conversionMoneda(dolar);
	}
}
