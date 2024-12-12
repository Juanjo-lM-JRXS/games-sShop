package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.dao.IOrdenesdetalleDao;
import co.edu.ue.entity.Ordenesdetalle;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value = "/orden-detalle")
public class OrdenesdetalleController {

	@Autowired
	IOrdenesdetalleDao dao;
	
	@PostMapping(value="guardarDetallesOrden")
	public List<Ordenesdetalle> postDetallesOrden(@RequestBody Ordenesdetalle ordenesdetalle) {
		return dao.guardarDetalleOrden(ordenesdetalle);
	}
	
	@GetMapping(value="lista")
	public List<Ordenesdetalle> getlistarDetallesOrden() {
		return dao.listaOrdenesDetallesCompleta();
	}
}
