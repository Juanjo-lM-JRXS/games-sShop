package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Ordenesdetalle;

import co.edu.ue.jpa.IOrdenesdetalleJpa;

@Repository
public class OrdenesdetalleDao implements IOrdenesdetalleDao{

	@Autowired
	IOrdenesdetalleJpa jpa;

	@Override
	public List<Ordenesdetalle> guardarDetalleOrden(Ordenesdetalle ordenesdetalles) {
		jpa.save(ordenesdetalles);
		return listaOrdenesDetallesCompleta();
	}

	@Override
	public Ordenesdetalle actualizarDetalleOrden(Ordenesdetalle ordenesdetalles) {
		return jpa.save(ordenesdetalles);
	}

	@Override
	public List<Ordenesdetalle> listaOrdenesDetallesCompleta() {
		return jpa.findAll();
	}

	@Override
	public Ordenesdetalle busquedaPorIdOrden(int id) {
		return jpa.findByOrdenId(id);
	}
	
	
}
