package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Ordenesdetalle;

public interface IOrdenesdetalleDao {
	List<Ordenesdetalle> guardarDetalleOrden (Ordenesdetalle ordenesdetalles);
	Ordenesdetalle actualizarDetalleOrden(Ordenesdetalle ordenesdetalles);
	
	List<Ordenesdetalle> listaOrdenesDetallesCompleta();
	//Ordenesdetalle busquedaPorIdOrden(int ordenesID);
}
