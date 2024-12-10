package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Usuario;

public interface IUsuarioService {
	List<Usuario> saveUsuario(Usuario usuario);
	Usuario upUsuario(Usuario usuario);
	
	List<Usuario> listUsuarioCompleta();
	Usuario findPorId(int id);
	/*Usuario findPorCorreo(String usuariosCorreo);
	Usuario findPorNombreUsuario(String usuariosNombreUsuario);*/
}
