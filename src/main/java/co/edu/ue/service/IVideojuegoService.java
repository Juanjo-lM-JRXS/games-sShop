package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Videojuego;

public interface IVideojuegoService {
	Videojuego saveVideojuegosdetalle(Videojuego videojuego);
	Videojuego upVideojuegosdetalle(Videojuego videojuego);
	
	List<Videojuego> listAllVideojuegos();
	Videojuego findPorId(int id);
	/*Videojuego findPorNombre(String videojuegosNombre);
	Videojuego findPorPlataforma(int videojuegosPlataformas);*/

}
