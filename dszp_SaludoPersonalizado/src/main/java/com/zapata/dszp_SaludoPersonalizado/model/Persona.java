package com.zapata.dszp_SaludoPersonalizado.model;

import java.io.Serializable;
import java.util.Objects;

public class Persona implements Serializable{

	private static final long serialVersionUID = -2628677306377167518L;
	private Long id_p;
	private String nombre_p;
	
	public Persona() {
	}

	public Persona(Long id_p, String nombre_p) {
		super();
		this.id_p = id_p;
		this.nombre_p = nombre_p;
	}



	public Long getId_p() {
		return id_p;
	}

	public void setId_p(Long id_p) {
		this.id_p = id_p;
	}

	public String getNombre_p() {
		return nombre_p;
	}

	public void setNombre_p(String nombre_p) {
		this.nombre_p = nombre_p;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_p, nombre_p);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(id_p, other.id_p) && Objects.equals(nombre_p, other.nombre_p);
	}

	@Override
	public String toString() {
		return "Persona [id_p=" + id_p + ", nombre_p=" + nombre_p + "]";
	}

	
}
