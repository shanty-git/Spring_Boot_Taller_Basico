package com.zapata.dszp_ValidarEdad.model;

import java.util.Objects;

public class EdadPersona {

	private String nombre;
	private int edad;
	
	public EdadPersona() {
	}
	
	public EdadPersona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EdadPersona other = (EdadPersona) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "EdadPersona [nombre=" + nombre + ", edad=" + edad + "]";
	}
}
