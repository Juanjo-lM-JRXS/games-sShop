package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.dao.IUsuarioDao;
import co.edu.ue.entity.Usuario;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	IUsuarioDao dao;
	
	@PostMapping(value="guardarUsuario")
	public List<Usuario> postUsuarios(@RequestBody Usuario usuario) {
		return dao.guardarUsuario(usuario);
	}
	
	@GetMapping(value="listarUsuarios")
	public List<Usuario> getlistarUsuarios() {
		return dao.listaUsuarioCompleta();
	}
}
