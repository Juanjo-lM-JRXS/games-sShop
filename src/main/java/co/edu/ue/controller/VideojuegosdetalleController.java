package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import co.edu.ue.entity.Videojuegosdetalle;
import co.edu.ue.service.IVideojuegosdetalleService;

public class VideojuegosdetalleController {

	@Autowired
	IVideojuegosdetalleService service;
	
	@GetMapping(value="listarVideojuegoDetalles")
	public List<Videojuegosdetalle> getVideojuegosDetalles() {
		return service.listVideojuegosdetalleCompleta();
	}
	
}
