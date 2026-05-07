package com.zapata.dszp_ConversionMoneda.model;

import java.util.Objects;

public class Moneda {

	private Double dolar;
	private Double pesosC;
	
	public Moneda() {
	}

	public Moneda(Double dolar, Double pesosC) {
		this.dolar = dolar;
		this.pesosC = pesosC;
	}

	public Double getDolar() {
		return dolar;
	}

	public void setDolar(Double dolar) {
		this.dolar = dolar;
	}

	public Double getPesosC() {
		return pesosC;
	}

	public void setPesosC(Double pesosC) {
		this.pesosC = pesosC;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dolar, pesosC);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moneda other = (Moneda) obj;
		return Objects.equals(dolar, other.dolar) && Objects.equals(pesosC, other.pesosC);
	}

	@Override
	public String toString() {
		return "Moneda [dolar=" + dolar + ", pesosC=" + pesosC + "]";
	}
}
