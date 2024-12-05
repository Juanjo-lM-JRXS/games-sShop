package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.ue.entity.Ordenesdetalle;
import co.edu.ue.service.IOrdenesdetallesService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class OrdenesdetallesController {

	@Autowired
	IOrdenesdetallesService service;
	
	@PostMapping(value="guardarDetallesOrden")
	public List<Ordenesdetalle> postDetallesOrden(@RequestBody Ordenesdetalle ordenesdetalle) {
		return service.saveDetalleOrden(ordenesdetalle);
	}
	
	@GetMapping(value="listarDetallesOrden")
	public List<Ordenesdetalle> getlistarDetallesOrden() {
		return service.listOrdenesDetallesCompleta();
	}
}
