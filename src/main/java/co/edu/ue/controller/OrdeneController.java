package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.edu.ue.dao.IOrdeneDao;
import co.edu.ue.entity.Ordene;
import co.edu.ue.entity.Plataforma;
import co.edu.ue.service.IOrdeneService;
import co.edu.ue.service.IPlataformaService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


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

	@DeleteMapping(value="eliminar/{id}")
	public Ordene eliminar(@PathVariable int id) { return service.delOrden(id);}

}
