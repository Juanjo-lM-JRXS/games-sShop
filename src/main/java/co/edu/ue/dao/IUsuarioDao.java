package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Usuario;

public interface IUsuarioDao {
	List<Usuario> guardarUsuario(Usuario usuario);
	Usuario actualizarUsuario(int id,Usuario usuario);
	Usuario saveUsuario(Usuario usuario);
	void eliminarUsuario(int id);
	
	List<Usuario> listaUsuarioCompleta();
	Usuario busquedaPorId(int usuariosID);
	Usuario busquedaPorNombreUsuario(String usuariosNombreUsuario);
}
