package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import co.edu.ue.entity.Videojuego;
import co.edu.ue.service.IVideojuegoService;

public class VideojuegoController {

	@Autowired
	IVideojuegoService service;
	
	@GetMapping(value="listarVideojuegoDetalles")
	public List<Videojuego> getVideojuegosDetalles() {
		return service.listVideojuegosdetalleCompleta();
	}
	
}
