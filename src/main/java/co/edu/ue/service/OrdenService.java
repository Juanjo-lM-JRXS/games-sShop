package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IOrdenDao;
import co.edu.ue.entity.Orden;

@Service
public class OrdenService implements IOrdenService{

	@Autowired
	IOrdenDao dao;
	
	@Override
	public List<Orden> addOrden(Orden orden) {
		return dao.guardarOrden(orden);
	}

	@Override
	public Orden upOrden(Orden orden) {
		return dao.actualizaOrden(orden);
	}

	@Override
	public List<Orden> listAll() {
		return dao.listaCompleta();
	}

	@Override
	public Orden findIdOrden(int id) {
		return dao.busquedaPorId(id);
	}

	@Override
	public Orden findUsuarioOrden(String usuario) {
		return dao.busquedaPorUsuario(usuario);
	}

}
