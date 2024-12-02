package co.edu.ue.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import co.edu.ue.entity.Usuario;

public class UsuariDao implements IUsuariDao{

	@Override
	public List<Usuario> guardarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listaUsuarioCompleta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario busquedaPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario busquedaPorCorreo(String usuariosCorreo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario busquedaPorNombreUsuario(String usuariosNombreUsuario) {
		// TODO Auto-generated method stub
		return null;
	}
}
