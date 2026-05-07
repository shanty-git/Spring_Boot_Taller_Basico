package com.zapata.dszp_GestionLibros.model;

import java.util.Date;
import java.util.Objects;

public class Libro {
	
	private String titulo;
	private String autor;
	private Date año_pub;
	
	public Libro() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getAño_pub() {
		return año_pub;
	}

	public void setAño_pub(Date año_pub) {
		this.año_pub = año_pub;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, año_pub, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(año_pub, other.año_pub)
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", año_pub=" + año_pub + "]";
	}
}
