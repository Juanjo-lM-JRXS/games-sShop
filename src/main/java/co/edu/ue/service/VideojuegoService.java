package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IVideojuegoDao;
import co.edu.ue.entity.Videojuego;

@Service
public class VideojuegoService implements IVideojuegoService{
	
	@Autowired
	IVideojuegoDao dao;
	
	@Override
	public List<Videojuego> saveVideojuegosdetalle(Videojuego videojuego) {
		return dao.guardarVideojuego(videojuego);
	}

	@Override
	public Videojuego upVideojuegosdetalle(Videojuego videojuego) {
		return dao.actualizarVideojuego(videojuego);
	}

	@Override
	public List<Videojuego> listAllVideojuegos() {
		return dao.listaVideojuegoCompleta();
	}

	@Override
	public Videojuego findPorId(int id) {
		return dao.busquedaPorIdVideojuego(id);
	}

}
