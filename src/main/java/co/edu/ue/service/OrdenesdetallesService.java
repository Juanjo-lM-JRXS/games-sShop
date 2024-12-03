package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.dao.IOrdenesdetallesDao;
import co.edu.ue.entity.Ordenesdetalle;

public class OrdenesdetallesService implements IOrdenesdetallesService{
	
	@Autowired
	IOrdenesdetallesDao dao;

	@Override
	public List<Ordenesdetalle> saveDetalleOrden(Ordenesdetalle ordenesdetalles) {
		return dao.guardarDetalleOrden(ordenesdetalles);
	}

	@Override
	public Ordenesdetalle upDetalleOrden(Ordenesdetalle ordenesdetalles) {
		return dao.actualizarDetalleOrden(ordenesdetalles);
	}

	@Override
	public List<Ordenesdetalle> listOrdenesDetallesCompleta() {
		return dao.listaOrdenesDetallesCompleta();
	}

	@Override
	public Ordenesdetalle findPorId(int id) {
		return dao.busquedaPorId(id);
	}

	@Override
	public Ordenesdetalle findPorIdOrden(int id) {
		return dao.busquedaPorIdOrden(id);
	}

}
