package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Ordene;

public interface IOrdeneDao {
	//Declaracion de metodos abstractos o constantes
	List<Ordene> guardarOrden(Ordene ordene);
	Ordene actualizaOrden(Ordene ordene);
	Ordene eliminarOrden(int id);
	
	// consultas
	List<Ordene> listaCompleta();
	Ordene busquedaPorOrdenesID(int ordenesID);
}
