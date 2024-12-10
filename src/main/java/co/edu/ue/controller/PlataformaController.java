package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.dao.IPlataformaDao;
import co.edu.ue.entity.Plataforma;

@RestController
@RequestMapping(value = "/plataforma")
public class PlataformaController {

	@Autowired
	IPlataformaDao dao;
		
	@GetMapping(value="listarPlataformas")
	public List<Plataforma> getlistarPlataformas() {
		return dao.listaPlataformaCompleta();
	}
	
}
