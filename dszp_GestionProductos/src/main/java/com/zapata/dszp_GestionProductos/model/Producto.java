package com.zapata.dszp_GestionProductos.model;

import java.io.Serializable;
import java.util.Objects;

public class Producto implements Serializable{

	private static final long serialVersionUID = 866909562836366203L;
	private Long cod_p;
	private String nombre_p;
	private double precio_unit;
	private int unidades_p;
	private Categoria cat;
	
	public Producto() {
	}

	public Producto(Categoria cat) {
		this.cat=cat;
	}
	
	public Long getCod_p() {
		return cod_p;
	}
	
	public void setCod_p(Long cod_p) {
		this.cod_p = cod_p;
	}
	
	public String getNombre_p() {
		return nombre_p;
	}
	
	public void setNombre_p(String nombre_p) {
		this.nombre_p = nombre_p;
	}
	
	public double getPrecio_unit() {
		return precio_unit;
	}
	
	public void setPrecio_unit(double precio_unit) {
		this.precio_unit = precio_unit;
	}
	
	public int getUnidades_p() {
		return unidades_p;
	}
	
	public void setUnidades_p(int unidades_p) {
		this.unidades_p = unidades_p;
	}

	public Categoria getCat() {
		return cat;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cat, cod_p, nombre_p, precio_unit, unidades_p);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(cat, other.cat) && cod_p == other.cod_p && Objects.equals(nombre_p, other.nombre_p)
				&& Double.doubleToLongBits(precio_unit) == Double.doubleToLongBits(other.precio_unit)
				&& unidades_p == other.unidades_p;
	}

	@Override
	public String toString() {
		return "Producto [cod_p=" + cod_p + ", nombre_p=" + nombre_p + ", precio_unit=" + precio_unit + ", unidades_p="
				+ unidades_p + ", cat=" + cat + "]";
	}
}
