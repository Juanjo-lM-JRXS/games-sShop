package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Videojuegosdetalle;


public interface IVideojuegosdetalleDao {
	List<Videojuegosdetalle> guardarVideojuegosdetalle(Videojuegosdetalle videojuegosplataforma);
	Videojuegosdetalle actualizarVideojuegosdetalle(Videojuegosdetalle videojuegosplataforma);
	
	List<Videojuegosdetalle> listaVideojuegosdetalleCompleta();
	Videojuegosdetalle busquedaPorId(int id);
	Videojuegosdetalle busquedaPorNombre(String videojuegosNombre);
	Videojuegosdetalle busquedaPorPlataforma(int videojuegosPlataformas);
}
