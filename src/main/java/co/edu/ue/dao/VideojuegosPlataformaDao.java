package co.edu.ue.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import co.edu.ue.entity.VideojuegosPlataforma;
import co.edu.ue.jpa.IVideojuegosPlataformaJpa;

@Repository
public class VideojuegosPlataformaDao implements IVideojuegosPlataformaDao{

	@Autowired
	IVideojuegosPlataformaJpa jpa;
	
	@Override
	public List<VideojuegosPlataforma> guardarVideojuegosPlataforma(VideojuegosPlataforma videojuegosplataforma) {
		jpa.save(videojuegosplataforma);
		return listaVideojuegosPlataformaCompleta();
	}

	@Override
	public VideojuegosPlataforma actualizarVideojuegosPlataforma(VideojuegosPlataforma videojuegosplataforma) {
		return jpa.save(videojuegosplataforma);
	}

	@Override
	public List<VideojuegosPlataforma> listaVideojuegosPlataformaCompleta() {
		return jpa.findAll();
	}

	@Override
	public VideojuegosPlataforma busquedaPorId(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}
}
