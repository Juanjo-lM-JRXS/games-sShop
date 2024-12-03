package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entity.Orden;
import co.edu.ue.service.IOrdenService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class OrdenController {

	@Autowired
	IOrdenService service;
	
	@PostMapping(value="guardarOrden")
	public List<Orden> postOrden(@RequestBody Orden orden) {
		return service.addOrden(orden);
	}
	
	@GetMapping(value="listarOrdenes")
	public List<Orden> getListarOrdenes() {
		return service.listAll();
	}
	
	
	
}
