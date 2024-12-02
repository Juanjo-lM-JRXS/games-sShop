package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Orden;

public interface IOrdenDao {
	//Declaracion de metodos abstractos o constantes
	List<Orden> guardarOrden(Orden orden);
	Orden actualizaOrden(Orden orden);
	
	// consultas
	List<Orden> listaCompleta();
	Orden busquedaPorId(int id);
	
}
