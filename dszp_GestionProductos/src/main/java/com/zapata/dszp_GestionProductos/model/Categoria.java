package com.zapata.dszp_GestionProductos.model;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable {

	private static final long serialVersionUID = 4515236913488009946L;
	private Long id_cat;
	private String nombre_cat;
	
	public Categoria() {
	}

	public Long getId_cat() {
		return id_cat;
	}
	
	public void setId_cat(Long id_cat) {
		this.id_cat = id_cat;
	}
	
	public String getNombre_cat() {
		return nombre_cat;
	}
	
	public void setNombre_cat(String nombre_cat) {
		this.nombre_cat = nombre_cat;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_cat, nombre_cat);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id_cat, other.id_cat) && Objects.equals(nombre_cat, other.nombre_cat);
	}

	@Override
	public String toString() {
		return "Categoria [id_cat=" + id_cat + ", nombre_cat=" + nombre_cat + "]";
	}
}
