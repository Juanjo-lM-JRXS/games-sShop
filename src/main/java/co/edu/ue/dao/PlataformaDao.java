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

import co.edu.ue.entity.Plataforma;

public class PlataformaDao implements IPlataformaDao{

	@Override
	public List<Plataforma> guardarPlataforma(Plataforma plataforma) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plataforma actualizarPlataforma(Plataforma plataforma) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Plataforma> listaPlataformaCompleta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plataforma busquedaPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
