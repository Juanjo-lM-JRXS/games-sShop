package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Usuario;

public interface IUsuarioService {
	List<Usuario> saveUsuario(Usuario usuario);
	Usuario upUsuario(Usuario usuario);
	Usuario upEstadoUsuario(Usuario usuario);
	
	List<Usuario> listaAllUsers();
	Usuario findPorId(int usuariosID);
	Usuario findPorNombreUsuario(String usuariosNombreUsuario);
	Usuario findUsuariosCorreo(String usuariosCorreo);
	Usuario findEstado(int usuariosEstado);
}
