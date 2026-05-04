package com.zapata.dszp_MensajesMotivacionales.repository;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.zapata.dszp_MensajesMotivacionales.model.Mensaje;

@Repository
public class MensajeRepository {

	private List<Mensaje> listaMen = new ArrayList<>();

	public MensajeRepository() {
	}
	
	public List<Mensaje> findAll() {
		return listaMen;
	}
	
	public void save(Mensaje men) {
		listaMen.add(men);
	}
}
