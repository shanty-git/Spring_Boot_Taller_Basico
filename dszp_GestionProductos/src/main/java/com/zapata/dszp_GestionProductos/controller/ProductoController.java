package com.zapata.dszp_GestionProductos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zapata.dszp_GestionProductos.model.Producto;
import com.zapata.dszp_GestionProductos.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	private final ProductoService pro_service;

	public ProductoController(ProductoService pro_service) {
		this.pro_service = pro_service;
	}
	
	@GetMapping
	public List<Producto> listarPro(){
		return pro_service.listar();
	}
	
	@GetMapping("/{id}")
	public List<Producto> listarProCat(Long id){
		return pro_service.buscarCat(id);
	}
	
	@PostMapping
	public String guardar(@RequestBody Producto p) {
		pro_service.agregarProducto(p);
		return "Producto creado";
	}
	
	@DeleteMapping("/{cod_p}")
	public String eliminar(@PathVariable Long cod_p) {
		
		return pro_service.eliminaProduct(cod_p) 
				? "Producto eliminado" 
				: "Producto no encontrado";
	}
}
