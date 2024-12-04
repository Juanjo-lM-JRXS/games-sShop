package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Orden;
import co.edu.ue.jpa.IOrdenJpa;

@Repository
public class OrdenDao implements IOrdenDao{

	@Autowired
	IOrdenJpa jpa;
	
	@Override
	public List<Orden> guardarOrden(Orden orden) { 
		jpa.save(orden);
		return listaCompleta();
	}

	@Override
	public Orden actualizaOrden(Orden orden) {
		return jpa.save(orden);
	}

	@Override
	public List<Orden> listaCompleta() {
		
		return jpa.findAll();
	}

	@Override
	public Orden busquedaPorId(int id) {
		return jpa.findById(id).orElse(null);
	}


}
