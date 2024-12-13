package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Ordene;
import co.edu.ue.jpa.IOrdeneJpa;

@Repository
public class OrdeneDao implements IOrdeneDao{

	@Autowired
	IOrdeneJpa jpa;

	@Override
	public List<Ordene> guardarOrden(Ordene ordene) {
		jpa.save(ordene);
		return listaCompleta();
	}

	@Override
	public Ordene actualizaOrden(Ordene ordene) {
		return jpa.save(ordene);
	}

	@Override
	public Ordene eliminarOrden(int id) {
		jpa.deleteById(id);
		listaCompleta();
		return null;
	}

	@Override
	public List<Ordene> listaCompleta() {		
		return jpa.findAll();
	}

	@Override
	public Ordene busquedaPorOrdenesID(int id) {
		return jpa.findById(id).orElse(null);
	}
	
	
/*	
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
	}*/


}
