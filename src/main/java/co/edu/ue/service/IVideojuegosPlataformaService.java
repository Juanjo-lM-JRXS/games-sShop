package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.VideojuegosPlataforma;

public interface IVideojuegosPlataformaService {
	List<VideojuegosPlataforma> saveVideojuegosPlataforma(VideojuegosPlataforma videojuegosplataforma);
	VideojuegosPlataforma upVideojuegosPlataforma(VideojuegosPlataforma videojuegosplataforma);
	
	List<VideojuegosPlataforma> listVideojuegosPlataformaCompleta();
	VideojuegosPlataforma findPorId(int id);

}
