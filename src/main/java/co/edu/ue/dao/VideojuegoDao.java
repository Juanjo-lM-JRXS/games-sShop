package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Videojuego;
import co.edu.ue.jpa.IVideojuegoJpa;

@Repository
public class VideojuegoDao implements IVideojuegoDao{

	@Autowired
	IVideojuegoJpa jpa;
	
	@Override
	public Videojuego guardarVideojuego(Videojuego videojuego) {
		return jpa.save(videojuego);
	}

	@Override
	public Videojuego actualizarVideojuego(Videojuego videojuego) {
		return jpa.save(videojuego);
	}

	@Override
	public Videojuego eliminarVideojuego(int id) {
		jpa.deleteById(id);
		listaVideojuegoCompleta();
		return null;
	}

	@Override
	public List<Videojuego> listaVideojuegoCompleta() {
		return jpa.findAll();
	}

	@Override
	public Videojuego busquedaPorIdVideojuego(int id) {
		return jpa.findById(id).orElse(null);
	}

}
