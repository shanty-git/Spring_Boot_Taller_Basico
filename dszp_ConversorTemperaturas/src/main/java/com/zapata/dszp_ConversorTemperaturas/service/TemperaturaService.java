package com.zapata.dszp_ConversorTemperaturas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zapata.dszp_ConversorTemperaturas.model.Temperatura;
import com.zapata.dszp_ConversorTemperaturas.repository.TemperaturaRepository;

@Service
public class TemperaturaService {

	private final TemperaturaRepository repoTem;

	public TemperaturaService(TemperaturaRepository repoTem) {
		this.repoTem = repoTem;
	}
	
	public List<Temperatura> listarTem(){
		return repoTem.findAll();
	}
	
	public Double calcularTemperatura(Temperatura t) {
		return (t.getGrados() * 9/5) +32;
	}
}
