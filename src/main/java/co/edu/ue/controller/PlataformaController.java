package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.edu.ue.dao.IPlataformaDao;
import co.edu.ue.entity.Plataforma;
import co.edu.ue.entity.Usuario;
import co.edu.ue.service.IPlataformaService;


@RestController
@RequestMapping(value = "/plataforma")
public class PlataformaController {

	@Autowired
	IPlataformaDao dao;
		
	@GetMapping(value="lista")
	public List<Plataforma> getlistarPlataformas() {
		return dao.listaPlataformaCompleta();
	}
	
	@PostMapping(value="guardar-plataforma")
	public List<Plataforma> postNuevaplataforma(@org.springframework.web.bind.annotation.RequestBody Plataforma plataforma) {		
		return dao.guardarPlataforma(plataforma);
	}
	
	@PutMapping(value="actualizar")
	public Plataforma putActualizarplataforma(@RequestBody Plataforma plataforma) {
		return dao.actualizarPlataforma(plataforma);
	}

	@DeleteMapping(value="eliminar/{id}")
	public Plataforma deletePlataforma(@RequestParam int id) {
		return dao.eliminarPlataforma(id);
	}
	
	
	
}
