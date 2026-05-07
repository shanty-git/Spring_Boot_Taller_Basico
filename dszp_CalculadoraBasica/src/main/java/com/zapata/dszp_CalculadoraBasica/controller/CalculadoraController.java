package com.zapata.dszp_CalculadoraBasica.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zapata.dszp_CalculadoraBasica.model.Calculadora;
import com.zapata.dszp_CalculadoraBasica.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	private final CalculadoraService calService;

	public CalculadoraController(CalculadoraService calService) {
		this.calService = calService;
	}
	
	@GetMapping
	public List<Calculadora> listaCal(){
		return calService.listaCalc();
	}
	
	@PostMapping("/suma")
	public Double calSuma(@RequestParam Double num1, @RequestParam Double num2) {
		return calService.suma(num1, num2);
	}
	
	@PostMapping("/resta")
	public Double calResta(@RequestParam Double num1, @RequestParam Double num2) {
		return calService.resta(num1, num2);
	}
	
	@PostMapping("/multi")
	public Double calMulti(@RequestParam Double num1, @RequestParam Double num2) {
		return calService.multi(num1, num2);
	}
	
	@PostMapping("/div")
	public Double calDiv(@RequestParam Double num1, @RequestParam Double num2) {
		return calService.div(num1, num2);
	}
}
