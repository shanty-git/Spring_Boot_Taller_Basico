package com.zapata.dszp_CalculadoraBasica.model;

import java.util.Objects;

public class Calculadora {

	private Double num1;
	private Double num2;
	private Double result;
	
	public Calculadora() {
	}

	public Calculadora(Double num1, Double num2, Double result) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.result = result;
	}

	public Double getNum1() {
		return num1;
	}

	public void setNum1(Double num1) {
		this.num1 = num1;
	}

	public Double getNum2() {
		return num2;
	}

	public void setNum2(Double num2) {
		this.num2 = num2;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	@Override
	public int hashCode() {
		return Objects.hash(num1, num2, result);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		return Objects.equals(num1, other.num1) && Objects.equals(num2, other.num2)
				&& Objects.equals(result, other.result);
	}

	@Override
	public String toString() {
		return "Calculadora [num1=" + num1 + ", num2=" + num2 + ", result=" + result + "]";
	}
}
