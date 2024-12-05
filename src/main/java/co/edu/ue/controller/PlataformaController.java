package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import co.edu.ue.entity.Plataforma;
import co.edu.ue.service.IPlataformaService;

public class PlataformaController {

	@Autowired
	IPlataformaService service;
		
	@GetMapping(value="listarPlataformas")
	public List<Plataforma> getlistarPlataformas() {
		return service.listPlataformaCompleta();
	}
	
}
