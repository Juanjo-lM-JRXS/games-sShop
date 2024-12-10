package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IOrdeneDao;
import co.edu.ue.entity.Ordene;

@Service
public class OrdeneService implements IOrdeneService{

	@Autowired
	IOrdeneDao dao;
	
	@Override
	public List<Ordene> addOrden(Ordene ordene) {
		return dao.guardarOrden(ordene);
	}

	@Override
	public Ordene upOrden(Ordene ordene) {
		return dao.actualizaOrden(ordene);
	}

	@Override
	public List<Ordene> listAll() {
		return dao.listaCompleta();
	}

	@Override
	public Ordene findIdOrden(int id) {
		return dao.busquedaPorOrdenesID(id);
	}


}
