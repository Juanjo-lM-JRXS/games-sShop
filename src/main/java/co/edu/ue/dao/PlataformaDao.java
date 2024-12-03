package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Plataforma;
import co.edu.ue.jpa.IPlataformaJpa;
@Repository
public class PlataformaDao implements IPlataformaDao{

	@Autowired
	IPlataformaJpa jpa;
	
	@Override
	public List<Plataforma> guardarPlataforma(Plataforma plataforma) {
		jpa.save(plataforma);
		return listaPlataformaCompleta();
	}

	@Override
	public Plataforma actualizarPlataforma(Plataforma plataforma) {
		return jpa.save(plataforma);
	}

	@Override
	public List<Plataforma> listaPlataformaCompleta() {
		return jpa.findAll();
	}

	@Override
	public Plataforma busquedaPorId(int id) {
		return jpa.findById(id).orElse(null);
	}
}
