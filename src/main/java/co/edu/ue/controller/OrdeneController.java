package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.dao.IOrdeneDao;
import co.edu.ue.entity.Ordene;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value = "/orden")
public class OrdeneController {

	@Autowired
	IOrdeneDao dao;
	
	@GetMapping(value="listarOrdenes")
	public List<Ordene> getListarOrdenes() {
		return dao.listaCompleta();
	}
	
	@PostMapping(value="guardarOrden")
	public List<Ordene> postOrden(@RequestBody Ordene orden) {
		return dao.guardarOrden(orden);
	}
	
	//Comentario
	
	
}
