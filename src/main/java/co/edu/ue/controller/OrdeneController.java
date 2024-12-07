package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entity.Ordene;
import co.edu.ue.service.IOrdeneService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class OrdeneController {

	@Autowired
	IOrdeneService service;
	
	@PostMapping(value="guardarOrden")
	public List<Ordene> postOrden(@RequestBody Ordene orden) {
		return service.addOrden(orden);
	}
	
	@GetMapping(value="listarOrdenes")
	public List<Ordene> getListarOrdenes() {
		return service.listAll();
	}
	
	
	
}
