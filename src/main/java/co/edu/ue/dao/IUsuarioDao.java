package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Usuario;

public interface IUsuarioDao {
	List<Usuario> guardarUsuario(Usuario usuario);
	Usuario actualizarUsuario(Usuario usuario);
	Usuario actualizarEstadoUsuario(Usuario usuario);
	
	List<Usuario> listaUsuarioCompleta();
	Usuario busquedaPorId(int usuariosID);
	Usuario busquedaPorNombreUsuario(String usuariosNombreUsuario);
	Usuario busquedaUsuariosCorreo(String usuariosCorreo);
	Usuario busquedaEstado(int estado);
}
