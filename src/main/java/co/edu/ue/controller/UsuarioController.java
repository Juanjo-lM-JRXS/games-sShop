package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.dao.IUsuarioDao;
import co.edu.ue.entity.Usuario;
import co.edu.ue.service.IUsuarioService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	IUsuarioService service;
	
	
	@GetMapping(value="lista")
	public List<Usuario> getlistarUsuarios() {
		return service.listaAllUsers();
	}
	
	@PostMapping(value="nuevo-usuario")
	public List<Usuario> postNuevoUsuario(@org.springframework.web.bind.annotation.RequestBody Usuario usuario) {
		return service.saveUsuario(usuario);
	}
	
	
	@PutMapping(value="actualiza")
	public Usuario putActualizaUsuario(@org.springframework.web.bind.annotation.RequestBody Usuario usuario) {
		return service.upUsuario(usuario);
	}
	
	//Toca mirar esta vuelta esta como mal
	@GetMapping(value="activos")
	public Usuario getConsultaUsuariosActivos() {
		return service.findEstado(1);
	}
	
	/*@PostMapping(value="/guardarUsuario", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Usuario>> postUsuarios(@RequestBody Usuario usuario) {
		List<Usuario> listUsuario= dao.guardarUsuario(usuario);
		return new ResponseEntity<List<Usuario>>(listUsuario, HttpStatus.CREATED);
	}
	
	
	  @PostMapping(value = "dato-sav", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Dato>> postDato(@RequestBody Dato dato) {
		List<Dato> listDato = service.addDato(dato);
		return new ResponseEntity<List<Dato>>(listDato, HttpStatus.CREATED);
	}
	 /* public class validacion{
	  *  public static void main(string[]args{
	  *   string email =
	  *   "usuario@@dominio.com";
	  *   String regex =
	  *   "^[a-zA-Z0-9._%+-]+@[a-zA-z0-9.-]+\\-[*a-zA-Z{2,}$";
	  *       if(email.matches(regex)){System.out.println("El correo es valido.");
	  *       }else{
	  *       System.out.println("Error:el correo no tiene un formato.
	  *       ")
	  * boolean e
	  */

	/*@GetMapping(value="/busquedaNombre")
	public Usuario getbusquedaNombre(@RequestParam("Nombre_Usuario") String nombre) {
		return service.(nombre);
		//return new ResponseEntity<Dato>(service.findIdDato(id), HttpStatus.FOUND)
	}
	
	@GetMapping(value="/busquedaID")
	public Usuario getbusquedaID(@RequestParam("id") int id) {
		return dao.busquedaPorId(id);
		//return new ResponseEntity<Dato>(service.findIdDato(id), HttpStatus.FOUND)
	}*/
}
