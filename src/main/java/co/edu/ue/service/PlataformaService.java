package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IPlataformaDao;
import co.edu.ue.entity.Plataforma;

@Service
public class PlataformaService implements IPlataformaService{

	@Autowired
	IPlataformaDao dao;

	@Override
	public List<Plataforma> savePlataforma(Plataforma plataforma) {
		return dao.guardarPlataforma(plataforma);
	}

	@Override
	public Plataforma upPlataforma(Plataforma plataforma) {
		int id = plataforma.getPlataformasID();
		if(!findPorId(id).equals(null)) {
			return dao.actualizarPlataforma(plataforma);
		}		
	return null;
	}

	@Override
	public Plataforma deletePlataforma(int id) {
		return dao.eliminarPlataforma(id);
	}

	@Override
	public List<Plataforma> listAllPlataformas() {
		return dao.listaPlataformaCompleta();
	}

	@Override
	public Plataforma findPorId(int id) {
		return dao.busquedaPorId(id);
	}
	
}
