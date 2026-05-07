package com.zapata.dszp_CalculadoraBasica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zapata.dszp_CalculadoraBasica.model.Calculadora;
import com.zapata.dszp_CalculadoraBasica.repository.CalculadoraRepository;

@Service
public class CalculadoraService {

	private final CalculadoraRepository repoCal;

	public CalculadoraService(CalculadoraRepository repoCal) {
		this.repoCal = repoCal;
	}
	
	public List<Calculadora> listaCalc(){
		return repoCal.findAll();
	}
	
	public Double suma(Double num1, Double num2) {
		
		Double result = num1 + num2;
		
		Calculadora c = new Calculadora(num1, num2, result);
		repoCal.save(c);
		
		return result;
	}
	
	public Double resta(Double num1, Double num2) {
			
		Double result = num1 - num2;
			
		Calculadora c = new Calculadora(num1, num2, result);
		repoCal.save(c);
			
		return result;
	}
	
	public Double multi(Double num1, Double num2) {
		
		Double result = num1 * num2;
		
		Calculadora c = new Calculadora(num1, num2, result);
		repoCal.save(c);
		
		return result;
	}
	
	public Double div(Double num1, Double num2) {
		
		Double result = num1 / num2;
		
		Calculadora c = new Calculadora(num1, num2, result);
		repoCal.save(c);
		
		return result;
	}
}
