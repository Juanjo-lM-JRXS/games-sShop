package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import co.edu.ue.entity.VideojuegosPlataforma;
import co.edu.ue.service.IVideojuegosPlataformaService;

public class VideojuegosPlataformaController {

	@Autowired
	IVideojuegosPlataformaService service;

	@GetMapping(value="listarVideojuegosPlataformas")
	public List<VideojuegosPlataforma> getListarOrdenes() {
		return service.listVideojuegosPlataformaCompleta();
	}
}
