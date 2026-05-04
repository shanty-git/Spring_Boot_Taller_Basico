package com.zapata.dszp_MensajesMotivacionales.service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.zapata.dszp_MensajesMotivacionales.model.Mensaje;
import com.zapata.dszp_MensajesMotivacionales.repository.MensajeRepository;

@Service
public class MensajeService {

	private final MensajeRepository repo;

	public MensajeService(MensajeRepository repo) {
		
		if(repo.findAll().isEmpty()) {
			
			Mensaje men1 = new Mensaje(Long.parseLong("1"), "No podemos resolver nuestros problemas con el mismo razonamiento que usamos cuando los creamos");
			Mensaje men2 = new Mensaje(Long.parseLong("2"), "Vive como si fueras a morir mañana; aprende como si fueras a vivir siempre");
			Mensaje men3 = new Mensaje(Long.parseLong("3"), "Cuando haces feliz a otras personas, recibes más felicidad a cambio. Deberías meditar bien sobre cuánta felicidad eres capaz de dar");
			Mensaje men4 = new Mensaje(Long.parseLong("4"), "Solo al arriesgarnos podemos hacer que nuestras vidas mejoren. El principal riesgo y el más difícil de asumir es ser honestos");
			Mensaje men5 = new Mensaje(Long.parseLong("5"), "El éxito no es definitivo; el fracaso no es fatal. Lo que realmente cuenta es tener valor para continuar");
			Mensaje men6 = new Mensaje(Long.parseLong("6"), "Desarrolla el éxito a partir de los fracasos. El desaliento y el fracaso son los peldaños hacia el éxito");
			Mensaje men7 = new Mensaje(Long.parseLong("7"), "No dejes que el ayer ocupe mucho espacio de tu hoy");
			Mensaje men8 = new Mensaje(Long.parseLong("8"), "El pesimista ve la dificultad en cada oportunidad. El optimista ve la oportunidad en cada dificultad");
			Mensaje men9 = new Mensaje(Long.parseLong("9"), "No dejes que la opinión de alguien sobre ti se convierta en tu realidad");
			Mensaje men10 = new Mensaje(Long.parseLong("10"), "No mires a tus pies para ver si lo estás haciendo bien. Simplemente, baila");
		
			repo.save(men1);
			repo.save(men2);
			repo.save(men3);
			repo.save(men4);
			repo.save(men5);
			repo.save(men6);
			repo.save(men7);
			repo.save(men8);
			repo.save(men9);
			repo.save(men10);
		}
		
		this.repo = repo;
	}
	
	public List<Mensaje> listaMensajes() {
		return repo.findAll();
	}
	
	public String mensajeAle() {
		
		List<Mensaje> mensaje = repo.findAll();
		
		if(mensaje.isEmpty()) {
			return "No hay mensajes disponibles";
		}
		
		int posicion = ThreadLocalRandom.current().nextInt(mensaje.size());
		
		return mensaje.get(posicion).getTexto();
		
	}
}
