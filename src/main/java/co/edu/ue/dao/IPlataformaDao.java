package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Plataforma;

public interface IPlataformaDao {
	List<Plataforma> guardarPlataforma (Plataforma plataforma);
	Plataforma actualizarPlataforma(Plataforma plataforma);
	
	List<Plataforma> listaPlataformaCompleta();
	Plataforma busquedaPorId(int id);

}
