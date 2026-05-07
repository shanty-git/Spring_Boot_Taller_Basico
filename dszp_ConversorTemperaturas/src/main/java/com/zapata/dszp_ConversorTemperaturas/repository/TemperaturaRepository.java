package com.zapata.dszp_ConversorTemperaturas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zapata.dszp_ConversorTemperaturas.model.Temperatura;

@Repository
public class TemperaturaRepository {

	private List<Temperatura> listaTem = new ArrayList<>();

	public TemperaturaRepository() {
	}
	
	public List<Temperatura> findAll(){
		return listaTem;
	}
	
	public void save(Temperatura t) {
		listaTem.add(t);
	}
}
