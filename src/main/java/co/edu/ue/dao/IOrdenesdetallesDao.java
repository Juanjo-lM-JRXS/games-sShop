package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Ordenesdetalles;

public interface IOrdenesdetallesDao {
	List<Ordenesdetalles> guardarDetalleOrden (Ordenesdetalles ordenesdetalles);
	Ordenesdetalles actualizarDetalleOrden(Ordenesdetalles ordenesdetalles);
	
	List<Ordenesdetalles> listaOrdenesDetallesCompleta();
	Ordenesdetalles busquedaPorId(int id);
	Ordenesdetalles busquedaPorIdOrden(int id);

}
