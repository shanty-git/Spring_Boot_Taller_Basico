package com.zapata.dszp_SaludoPersonalizado.model;

import java.io.Serializable;
import java.util.Objects;

public class SaludoPer implements Serializable {

	private static final long serialVersionUID = 7793853632938347981L;
	private Long id_saludo;
	private String textSaludo;

	public SaludoPer() {
	}
	
	public Long getId_saludo() {
		return id_saludo;
	}
	
	public void setId_saludo(Long id_saludo) {
		this.id_saludo = id_saludo;
	}
	
	public String getTextSaludo() {
		return textSaludo;
	}
	
	public void setTextSaludo(String textSaludo) {
		this.textSaludo = textSaludo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_saludo, textSaludo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaludoPer other = (SaludoPer) obj;
		return Objects.equals(id_saludo, other.id_saludo) && Objects.equals(textSaludo, other.textSaludo);
	}

	@Override
	public String toString() {
		return "SaludoPer [id_saludo=" + id_saludo + ", textSaludo=" + textSaludo + "]";
	}
}
