package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.dao.IUsuarioDao;
import co.edu.ue.entity.Usuario;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	IUsuarioDao dao;
	
	@PostMapping(value="/guardarUsuario")
	public List<Usuario> postUsuarios(@RequestBody Usuario usuario) {
		return dao.guardarUsuario(usuario);
		//List<Usuario> listUser = dao.guardarUsuario(usuario);
		//return new ResponseEntity<List<Usuario>>(listUser, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/lista")
	public List<Usuario> getlistarUsuarios() {
		return dao.listaUsuarioCompleta();
	}
	
	@GetMapping(value="/busquedaNombre")
	public Usuario getbusquedaNombre(@RequestParam("Nombre_Usuario") String nombre) {
		return dao.busquedaPorNombreUsuario(nombre);
		//return new ResponseEntity<Dato>(service.findIdDato(id), HttpStatus.FOUND)
	}
	
	@GetMapping(value="/busquedaID")
	public Usuario getbusquedaID(@RequestParam("id") int id) {
		return dao.busquedaPorId(id);
		//return new ResponseEntity<Dato>(service.findIdDato(id), HttpStatus.FOUND)
	}
}
