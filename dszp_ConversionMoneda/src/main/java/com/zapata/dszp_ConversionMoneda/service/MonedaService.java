package com.zapata.dszp_ConversionMoneda.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zapata.dszp_ConversionMoneda.model.Moneda;
import com.zapata.dszp_ConversionMoneda.repository.MonedaRepository;

@Service
public class MonedaService {

	private final Double tasaFija = 3700.0;
	private final MonedaRepository repoMon;
	
	public MonedaService(MonedaRepository repoMon) {
		this.repoMon = repoMon;
	}

	public List<Moneda> listaMoneda(){
		return repoMon.findAll();
	}
	
	public String conversionMoneda(Double d) {
		
		if(d < 0) {
			return "El valor ingresado no es valido";
		}
		
		double pesos = d * tasaFija;
		
		Moneda m = new Moneda(d,pesos);
		repoMon.save(m);
		
		return d + " USD equivalen a " + pesos + " COP";
		
	}
}
