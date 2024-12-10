package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.dao.IVideojuegoDao;
import co.edu.ue.entity.Videojuego;

@RestController
@RequestMapping(value = "/videojuego")
public class VideojuegoController {

	@Autowired
	IVideojuegoDao dao;
	
	@GetMapping(value="listarVideojuegoDetalles")
	public List<Videojuego> getVideojuegosDetalles() {
		return dao.listaVideojuegoCompleta();
	}
	
}
