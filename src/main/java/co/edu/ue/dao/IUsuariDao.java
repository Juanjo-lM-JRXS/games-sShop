package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Usuario;

public interface IUsuariDao {
	List<Usuario> guardarUsuario(Usuario usuario);
	Usuario actualizarUsuario(Usuario usuario);
	
	List<Usuario> listaUsuarioCompleta();
	Usuario busquedaPorId(int id);
	Usuario busquedaPorCorreo(String usuariosCorreo);
	Usuario busquedaPorNombreUsuario(String usuariosNombreUsuario);
}
