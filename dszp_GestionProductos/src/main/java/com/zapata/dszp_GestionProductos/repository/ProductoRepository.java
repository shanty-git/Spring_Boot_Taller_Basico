package com.zapata.dszp_GestionProductos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zapata.dszp_GestionProductos.model.Producto;

@Repository
public class ProductoRepository {

	private List<Producto> lista_In = new ArrayList<>();

	public ProductoRepository() {
	}
	
	public List<Producto> findAll(){
		return lista_In;
	}
	
	public void save(Producto p) {
		lista_In.add(p);
	}
	
	public void delete(Long cod_p) {
		lista_In.removeIf(u -> u.getCod_p().equals(cod_p));
	}
}
