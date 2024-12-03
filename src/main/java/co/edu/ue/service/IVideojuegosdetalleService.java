package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Videojuegosdetalle;

public interface IVideojuegosdetalleService {
	List<Videojuegosdetalle> saveVideojuegosdetalle(Videojuegosdetalle videojuegosplataforma);
	Videojuegosdetalle upVideojuegosdetalle(Videojuegosdetalle videojuegosplataforma);
	
	List<Videojuegosdetalle> listVideojuegosdetalleCompleta();
	Videojuegosdetalle findPorId(int id);
	Videojuegosdetalle findPorNombre(String videojuegosNombre);
	Videojuegosdetalle findPorPlataforma(int videojuegosPlataformas);

}
