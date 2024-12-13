package co.edu.ue.dao;

import java.util.List;
import java.util.Objects;

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
	public Usuario actualizarUsuario(int id, Usuario usuario) {
		Usuario usuarioNew = jpa.findById(id).get();
		
		if(Objects.nonNull(usuario.getUsuariosContraseña()) && 
				!"".equalsIgnoreCase(usuario.getUsuariosContraseña())){
			usuarioNew.setUsuariosContraseña(usuarioNew.getUsuariosContraseña());
		}
		
		if(Objects.nonNull(usuario.getUsuariosCorreo()) && 
				!"".equalsIgnoreCase(usuario.getUsuariosCorreo())){
			usuarioNew.setUsuariosCorreo(usuarioNew.getUsuariosCorreo());
		}
		
		if(Objects.nonNull(usuario.getUsuariosNombreUsuario()) && 
				!"".equalsIgnoreCase(usuario.getUsuariosNombreUsuario())){
			usuarioNew.setUsuariosNombreUsuario(usuarioNew.getUsuariosNombreUsuario());
		}
		
		if(Objects.nonNull(usuario.getUsuariosPrimerApellido()) && 
				!"".equalsIgnoreCase(usuario.getUsuariosPrimerApellido())){
			usuarioNew.setUsuariosPrimerApellido(usuarioNew.getUsuariosPrimerApellido());
		}
		
		if(Objects.nonNull(usuario.getUsuariosPrimerNombre()) && 
				!"".equalsIgnoreCase(usuario.getUsuariosPrimerNombre())){
			usuarioNew.setUsuariosPrimerNombre(usuarioNew.getUsuariosPrimerNombre());
		}
		
		if(Objects.nonNull(usuario.getUsuariosSegundoNombre()) && 
				!"".equalsIgnoreCase(usuario.getUsuariosSegundoNombre())){
			usuarioNew.setUsuariosSegundoNombre(usuarioNew.getUsuariosSegundoNombre());
		}
		
		if(Objects.nonNull(usuario.getUsuariosSegundorApellido()) && 
				!"".equalsIgnoreCase(usuario.getUsuariosSegundorApellido())){
			usuarioNew.setUsuariosSegundorApellido(usuarioNew.getUsuariosSegundorApellido());
		}	
		
		return jpa.save(usuarioNew);
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

	@Override
	public Usuario saveUsuario(Usuario usuario) {		
		return jpa.save(usuario);
	}

	@Override
	public void eliminarUsuario(int id){
		jpa.deleteById(id);
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
