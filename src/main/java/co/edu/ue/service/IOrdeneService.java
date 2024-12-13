package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Ordene;

public interface IOrdeneService {
	//Declaracion de metodos abstractos o constantes
	List<Ordene> addOrden(Ordene ordene);
	Ordene upOrden(Ordene ordene);
	Ordene delOrden(int id);
	
	// consultas
	List<Ordene> listAll();
	Ordene findIdOrden(int id);
}
