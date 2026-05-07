package com.zapata.dszp_ConversionMoneda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zapata.dszp_ConversionMoneda.model.Moneda;

@Repository
public class MonedaRepository {

	private List<Moneda> listaMon = new ArrayList<>();

	public MonedaRepository() {
	}
	
	public List<Moneda> findAll(){
		return listaMon;
	}
	
	public void save(Moneda m) {
		listaMon.add(m);
	}
}
