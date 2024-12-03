package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Ordenesdetalle;

public interface IOrdenesdetallesDao {
	List<Ordenesdetalle> guardarDetalleOrden (Ordenesdetalle ordenesdetalles);
	Ordenesdetalle actualizarDetalleOrden(Ordenesdetalle ordenesdetalles);
	
	List<Ordenesdetalle> listaOrdenesDetallesCompleta();
	Ordenesdetalle busquedaPorId(int id);
	Ordenesdetalle busquedaPorIdOrden(int id);

}
