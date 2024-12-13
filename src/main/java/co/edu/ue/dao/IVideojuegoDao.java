package co.edu.ue.dao;

import java.util.List;


import co.edu.ue.entity.Videojuego;

public interface IVideojuegoDao {
	Videojuego guardarVideojuego(Videojuego videojuego);
	Videojuego actualizarVideojuego(Videojuego videojuego);
	Videojuego eliminarVideojuego(int id);
	
	List<Videojuego> listaVideojuegoCompleta();
	Videojuego busquedaPorIdVideojuego(int videojuegosID);
}
