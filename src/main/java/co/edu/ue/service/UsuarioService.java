package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.dao.IUsuariDao;
import co.edu.ue.entity.Usuario;

public class UsuarioService implements IUsuarioService{
	
	@Autowired
	IUsuariDao dao;
	
	@Override
	public List<Usuario> saveUsuario(Usuario usuario) {
		return dao.guardarUsuario(usuario);
	}

	@Override
	public Usuario upUsuario(Usuario usuario) {
		return dao.actualizarUsuario(usuario);
	}

	@Override
	public List<Usuario> listUsuarioCompleta() {
		return dao.listaUsuarioCompleta();
	}

	@Override
	public Usuario findPorId(int id) {
		return dao.busquedaPorId(id);
	}

	@Override
	public Usuario findPorCorreo(String usuariosCorreo) {
		return dao.busquedaPorCorreo(usuariosCorreo);
	}

	@Override
	public Usuario findPorNombreUsuario(String usuariosNombreUsuario) {
		return dao.busquedaPorNombreUsuario(usuariosNombreUsuario);
	}

}
