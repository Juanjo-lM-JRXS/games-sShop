package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.dao.IVideojuegosdetalleDao;
import co.edu.ue.entity.Videojuegosdetalle;

public class VideojuegosdetalleService implements IVideojuegosdetalleService{
	
	@Autowired
	IVideojuegosdetalleDao dao;
	
	
	@Override
	public List<Videojuegosdetalle> saveVideojuegosdetalle(Videojuegosdetalle videojuegosplataforma) {
		return dao.guardarVideojuegosdetalle(videojuegosplataforma);
	}

	@Override
	public Videojuegosdetalle upVideojuegosdetalle(Videojuegosdetalle videojuegosplataforma) {
		return dao.actualizarVideojuegosdetalle(videojuegosplataforma);
	}

	@Override
	public List<Videojuegosdetalle> listVideojuegosdetalleCompleta() {
		return dao.listaVideojuegosdetalleCompleta();
	}

	@Override
	public Videojuegosdetalle findPorId(int id) {
		return dao.busquedaPorId(id);
	}

	@Override
	public Videojuegosdetalle findPorNombre(String videojuegosNombre) {
		return dao.busquedaPorNombre(videojuegosNombre);
	}

	@Override
	public Videojuegosdetalle findPorPlataforma(int videojuegosPlataformas) {
		return dao.busquedaPorPlataforma(videojuegosPlataformas);
	}

}
