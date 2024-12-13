package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IUsuarioDao;
import co.edu.ue.entity.Usuario;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	IUsuarioDao dao;

	@Override
	public List<Usuario> saveUsuario(Usuario usuario) {
		return dao.guardarUsuario(usuario);
	}

	@Override
	public Usuario upUsuario(Usuario usuario) {
		int id = usuario.getUsuariosID();
		if(!findPorId(id).equals(null)) {
			return dao.actualizarUsuario(usuario);
		}		
		return null;
	}


	@Override
	public List<Usuario> listaAllUsers() {
		return dao.listaUsuarioCompleta();
	}

	@Override
	public Usuario findPorId(int usuariosID) {
		return dao.busquedaPorId(usuariosID);
	}

	@Override
	public Usuario findPorNombreUsuario(String usuariosNombreUsuario) {
		return dao.busquedaPorNombreUsuario(usuariosNombreUsuario);
	}

	@Override
	public Usuario findUsuariosCorreo(String usuariosCorreo) {
		return dao.busquedaUsuariosCorreo(usuariosCorreo);
	}

	@Override
	public Usuario findEstado(int usuariosEstado) {
		return dao.busquedaEstado(usuariosEstado);
	}

	@Override
	public Usuario upEstadoUsuario(Usuario usuario) {
		return dao.actualizarUsuario(usuario);
	}
	
}
