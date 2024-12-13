package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.dao.IPlataformaDao;
import co.edu.ue.entity.Plataforma;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/plataforma")
public class PlataformaController {

	@Autowired
	IPlataformaDao dao;
		
	@GetMapping(value="/lista")
	public List<Plataforma> getlistarPlataformas() {
		return dao.listaPlataformaCompleta();
	}
	
	@PostMapping(value="/guardar-plataforma")
	public List<Plataforma> postNuevaplataforma(@RequestBody Plataforma plataforma) {		
		return dao.guardarPlataforma(plataforma);
	}
	
}
