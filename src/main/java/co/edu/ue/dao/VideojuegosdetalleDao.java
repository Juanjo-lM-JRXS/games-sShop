package co.edu.ue.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import co.edu.ue.entity.Videojuegosdetalle;

public class VideojuegosdetalleDao implements IVideojuegosdetalleDao{

	@Override
	public List<Videojuegosdetalle> guardarVideojuegosdetalle(Videojuegosdetalle videojuegosplataforma) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Videojuegosdetalle actualizarVideojuegosdetalle(Videojuegosdetalle videojuegosplataforma) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Videojuegosdetalle> listaVideojuegosdetalleCompleta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Videojuegosdetalle busquedaPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Videojuegosdetalle busquedaPorNombre(String videojuegosNombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Videojuegosdetalle busquedaPorPlataforma(int videojuegosPlataformas) {
		// TODO Auto-generated method stub
		return null;
	}
}
