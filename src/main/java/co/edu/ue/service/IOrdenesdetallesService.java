package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Ordenesdetalle;

public interface IOrdenesdetallesService {

	List<Ordenesdetalle> saveDetalleOrden (Ordenesdetalle ordenesdetalles);
	Ordenesdetalle upDetalleOrden(Ordenesdetalle ordenesdetalles);
	
	List<Ordenesdetalle> listOrdenesDetallesCompleta();
	Ordenesdetalle findPorId(int id);
	Ordenesdetalle findPorIdOrden(int id);
	
}
