package co.edu.ue.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.edu.ue.entity.Ordenesdetalles;
import co.edu.ue.jpa.IOrdenJpa;

@Repository
public class OrdenesdetallesDao implements IOrdenesdetallesDao{

	@Autowired
	IOrdendetallesJpa jpa;
	
	@Transactional
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ordenesdetalles busquedaPorIdOrden(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
