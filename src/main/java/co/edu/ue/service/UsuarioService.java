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
		if (!findPorId(id).equals(null)) {
			return dao.actualizarUsuario(usuario);
		}
		return null;
	}

	@Override
	public List<Usuario> listUsuarioCompleta() {
		return dao.listaUsuarioCompleta();
	}

	@Override
	public Usuario findPorId(int id) {
		return dao.busquedaPorId(id);
	}

	/*@Override
	public Usuario findPorCorreo(String usuariosCorreo) {
		return dao.busquedaPorCorreo(usuariosCorreo);
	}

	@Override
	public Usuario findPorNombreUsuario(String usuariosNombreUsuario) {
		return dao.busquedaPorNombreUsuario(usuariosNombreUsuario);
	}*/

}
