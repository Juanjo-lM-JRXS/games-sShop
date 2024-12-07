package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IOrdenesdetalleDao;
import co.edu.ue.entity.Ordenesdetalle;

@Service
public class OrdenesdetalleService implements IOrdenesdetalleService{
	
	@Autowired
	IOrdenesdetalleDao dao;

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
	public Ordenesdetalle findPorIdOrden(int id) {
		return dao.busquedaPorIdOrden(id);
	}

}
