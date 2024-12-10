package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Ordenesdetalle;

public interface IOrdenesdetalleService {

	List<Ordenesdetalle> saveDetalleOrden (Ordenesdetalle ordenesdetalles);
	Ordenesdetalle upDetalleOrden(Ordenesdetalle ordenesdetalles);
	
	List<Ordenesdetalle> listOrdenesDetallesCompleta();
	//Ordenesdetalle findPorIdOrden(int id);
	
}
