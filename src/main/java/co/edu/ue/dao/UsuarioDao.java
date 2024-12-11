package co.edu.ue.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Usuario;
import co.edu.ue.jpa.IUsuarioJpa;

@Repository
public class UsuarioDao implements IUsuarioDao{

	@Autowired
	IUsuarioJpa jpa;
	
	@Override
	public List<Usuario> guardarUsuario(Usuario usuario) {
		jpa.save(usuario);
		return listaUsuarioCompleta();
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return jpa.save(usuario);
	}

	@Override
	public List<Usuario> listaUsuarioCompleta() {
		return jpa.findAll();
	}

	@Override
	public Usuario busquedaPorId(int id) {
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Usuario busquedaPorNombreUsuario(String usuariosNombreUsuario) {
		return jpa.findByusuariosNombreUsuario(usuariosNombreUsuario);
	}

	/*@Override
	public Usuario busquedaPorCorreo(String usuariosCorreo) {
		return jpa.findByUsuariosCorreo(usuariosCorreo);
	}

	@Override
	public Usuario busquedaPorNombreUsuario(String usuariosNombreUsuario) {
		return jpa.findByNombreUsuario(usuariosNombreUsuario);
	}*/
}
