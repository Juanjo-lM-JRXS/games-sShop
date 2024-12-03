package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Videojuegosdetalle;
import co.edu.ue.jpa.IVideojuegosdetalleJpa;

@Repository
public class VideojuegosdetalleDao implements IVideojuegosdetalleDao{

	@Autowired
	IVideojuegosdetalleJpa jpa;
	
	@Override
	public List<Videojuegosdetalle> guardarVideojuegosdetalle(Videojuegosdetalle videojuegosplataforma) {
		jpa.save(videojuegosplataforma);
		return listaVideojuegosdetalleCompleta();
	}

	@Override
	public Videojuegosdetalle actualizarVideojuegosdetalle(Videojuegosdetalle videojuegosplataforma) {
		return jpa.save(videojuegosplataforma);
	}

	@Override
	public List<Videojuegosdetalle> listaVideojuegosdetalleCompleta() {
		return jpa.findAll();
	}

	@Override
	public Videojuegosdetalle busquedaPorId(int id) {
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Videojuegosdetalle busquedaPorNombre(String videojuegosNombre) {
		return jpa.findByNombre(videojuegosNombre);
	}

	@Override
	public Videojuegosdetalle busquedaPorPlataforma(int videojuegosPlataformas) {
		return jpa.findByPlataforma(videojuegosPlataformas);
	}
}
