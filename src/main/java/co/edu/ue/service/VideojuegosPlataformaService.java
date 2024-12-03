package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.dao.IVideojuegosPlataformaDao;
import co.edu.ue.entity.VideojuegosPlataforma;

public class VideojuegosPlataformaService implements IVideojuegosPlataformaService {

	@Autowired
	IVideojuegosPlataformaDao dao;
	
	@Override
	public List<VideojuegosPlataforma> saveVideojuegosPlataforma(VideojuegosPlataforma videojuegosplataforma) {
		return dao.guardarVideojuegosPlataforma(videojuegosplataforma);
	}

	@Override
	public VideojuegosPlataforma upVideojuegosPlataforma(VideojuegosPlataforma videojuegosplataforma) {
		return dao.actualizarVideojuegosPlataforma(videojuegosplataforma);
	}

	@Override
	public List<VideojuegosPlataforma> listVideojuegosPlataformaCompleta() {
		return dao.listaVideojuegosPlataformaCompleta();
	}

	@Override
	public VideojuegosPlataforma findPorId(int id) {
		return dao.busquedaPorId(id);
	}

}
