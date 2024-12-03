package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Orden;

public interface IOrdenService {
	//Declaracion de metodos abstractos o constantes
	List<Orden> addOrden(Orden orden);
	Orden upOrden(Orden orden);
	
	// consultas
	List<Orden> listAll();
	Orden findIdOrden(int id);
	Orden findUsuarioOrden(String usuario);
}
