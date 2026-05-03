package com.zapata.dszp_GestionProductos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zapata.dszp_GestionProductos.model.Producto;
import com.zapata.dszp_GestionProductos.repository.ProductoRepository;

@Service
public class ProductoService {

	private final ProductoRepository repo_p;

	public ProductoService(ProductoRepository repo_p) {
		this.repo_p = repo_p;
	}
	
	public List<Producto> listar(){
		return repo_p.findAll();
	}
	
	public void agregarProducto(Producto p) {
		repo_p.save(p);
	}
	
	public List<Producto> buscarCat(Long id) {
		
		List<Producto> existe = repo_p.findAll().stream().filter(u -> id.equals(u.getCat().getId_cat())).toList();
		return existe;
		
	}
	
	public boolean eliminaProduct(Long cod_p) {
		
		Producto existe = repo_p.findAll().stream().
							filter(u -> cod_p.equals(u.getCod_p())).
							findFirst().orElse(null);
		
		if (existe != null) {
			repo_p.delete(cod_p);
			return true;
		}
		
		return false;
	}
}
