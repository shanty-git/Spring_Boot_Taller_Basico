package com.zapata.dszp_CalculadoraBasica.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zapata.dszp_CalculadoraBasica.model.Calculadora;

@Repository
public class CalculadoraRepository {

	private List<Calculadora> listaCal = new ArrayList<>();

	public CalculadoraRepository() {
	}
	
	public List<Calculadora> findAll(){
		return listaCal;
	}
	
	public void save(Calculadora cal) {
		listaCal.add(cal);
	}
}
