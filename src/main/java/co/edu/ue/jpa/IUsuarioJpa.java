package co.edu.ue.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Usuario;

@Repository
public interface IUsuarioJpa extends JpaRepository<Usuario, Integer>{
	Usuario findByUsuariosCorreo(String usuariosCorreo);
	Usuario findByusuariosNombreUsuario(String usuariosNombreUsuario);
	//Usuario findByusuariosEstado(int usuariosEstado);
	List<Usuario> findByusuariosEstado(int usuariosEstado);
}
