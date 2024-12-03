package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Ordenesdetalles;

import co.edu.ue.jpa.IOrdenesdetallesJpa;

@Repository
public class OrdenesdetallesDao implements IOrdenesdetallesDao{

	@Autowired
	IOrdenesdetallesJpa jpa;

	@Override
	public List<Ordenesdetalles> guardarDetalleOrden(Ordenesdetalles ordenesdetalles) {
		jpa.save(ordenesdetalles);
		return listaOrdenesDetallesCompleta();
	}

	@Override
	public Ordenesdetalles actualizarDetalleOrden(Ordenesdetalles ordenesdetalles) {
		return jpa.save(ordenesdetalles);
	}

	@Override
	public List<Ordenesdetalles> listaOrdenesDetallesCompleta() {
		return jpa.findAll();
	}

	@Override
	public Ordenesdetalles busquedaPorId(int id) {
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Ordenesdetalles busquedaPorIdOrden(int id) {
		return jpa.findByOrdenId(id);
	}
	
	
}
