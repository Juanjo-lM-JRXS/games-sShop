package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.VideojuegosPlataforma;


public interface IVideojuegosPlataformaDao {
	List<VideojuegosPlataforma> guardarVideojuegosPlataforma(VideojuegosPlataforma videojuegosplataforma);
	VideojuegosPlataforma actualizarVideojuegosPlataforma(VideojuegosPlataforma videojuegosplataforma);
	
	List<VideojuegosPlataforma> listaVideojuegosPlataformaCompleta();
	VideojuegosPlataforma busquedaPorId(int id);

}
