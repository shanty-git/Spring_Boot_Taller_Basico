package com.zapata.dszp_ConversorTemperaturas.model;

public class Temperatura {

	private Double grados;
	
	public Temperatura() {
	}
	
	public Temperatura(double grados) {
		super();
		this.grados = grados;
	}


	public Double getGrados() {
		return grados;
	}

	public void setGrados(Double grados) {
		this.grados = grados;
	}
}
