package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.dao.IOrdeneDao;
import co.edu.ue.entity.Ordene;
import co.edu.ue.entity.Plataforma;
import co.edu.ue.service.IOrdeneService;
import co.edu.ue.service.IPlataformaService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping(value = "/orden")
public class OrdeneController {

	@Autowired
	IOrdeneService service;
	
	@GetMapping(value="lista")
	public List<Ordene> getListarOrdenes() {
		return service.listAll();
	}
	
	@PostMapping(value="guardarOrden")
	public List<Ordene> postOrden(@RequestBody Ordene orden) {
		return service.addOrden(orden);
		
	}
	
	@PutMapping(value="actualiza/{id}")
	public Ordene putGame(@PathVariable int id, @RequestBody Ordene ordene) {		
		return service.upOrden(ordene);
	}
	
}
