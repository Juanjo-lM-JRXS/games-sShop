package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.ue.entity.Usuario;
import co.edu.ue.service.IUsuarioService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class UsuarioController {

	@Autowired
	IUsuarioService service;
	
	@PostMapping(value="guardarUsuario")
	public List<Usuario> postUsuarios(@RequestBody Usuario usuario) {
		return service.saveUsuario(usuario);
	}
	
	@GetMapping(value="listarUsuarios")
	public List<Usuario> getlistarUsuarios() {
		return service.listUsuarioCompleta();
	}
}
