package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.dao.IVideojuegoDao;
import co.edu.ue.entity.Usuario;
import co.edu.ue.entity.Videojuego;
import co.edu.ue.service.IVideojuegoService;

@RestController
@RequestMapping(value = "/videojuego")
public class VideojuegoController {

	@Autowired
	IVideojuegoService service;
	
	@GetMapping(value="lista")
	public List<Videojuego> getVideojuegosDetalles() {
		return service.listAllVideojuegos();
	}
	
	@PostMapping(value="nuevo-videojuego")
	public Videojuego postNuevoUsuario(@RequestBody Videojuego videojuego) {
		return service.saveVideojuegosdetalle(videojuego);
	}
	
	@PutMapping("videojuego/{id}")
	public Videojuego putMethodName(@PathVariable String id, @RequestBody Videojuego videojuego) {
		return service.upVideojuegosdetalle(videojuego);
	}
	
	
}
