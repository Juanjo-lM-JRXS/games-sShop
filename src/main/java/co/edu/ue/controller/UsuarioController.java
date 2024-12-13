package co.edu.ue.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entity.Usuario;
import co.edu.ue.service.IUsuarioService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    IUsuarioService service;

    @GetMapping(value = "lista")
    public List<Usuario> getlistarUsuarios() {
        return service.listaAllUsers();
    }

    @PostMapping(value = "nuevo-usuario")
    public Map<String, String> postNuevoUsuario(@RequestBody Usuario usuario) {
        Map<String, String> respuesta = new HashMap<>();

        // Validación de que el objeto usuario no sea nulo
        if (usuario == null) {
            respuesta.put("mensaje", "Error: El objeto usuario no puede estar vacío.");
            respuesta.put("valida", "false");
            return respuesta;
        }

        // Obtén la contraseña del usuario
        String contrasena = usuario.getUsuariosContraseña();

        // Imprime la contraseña para depuración
        System.out.println("Contraseña recibida: " + contrasena);

        // Validación de la contraseña
        if (contrasena == null || contrasena.isEmpty()) {
            respuesta.put("mensaje", "Error: La contraseña no puede estar vacía.");
            respuesta.put("valida", "false");
        } else {
            // Si la contraseña no está vacía, guarda el usuario
            service.saveUsuario(usuario);
            respuesta.put("mensaje", "Usuario guardado con éxito.");
            respuesta.put("valida", "true");
        }

        return respuesta; // Devuelve la respuesta
    }

    @PutMapping(value = "actualiza")
    public Usuario putActualizaUsuario(@RequestBody Usuario usuario) {
        return service.upUsuario(usuario);
    }

    @GetMapping(value = "activos")
    public List<Usuario> getConsultaUsuariosActivos() {
        return (List<Usuario>) service.busquedaEstado(1);
    }
    
    @DeleteMapping(value="delete/{id}")
    public Usuario deleteUsuario(@PathVariable int id){
    	return service.deleteUsuario(id);
    }
    
    
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

