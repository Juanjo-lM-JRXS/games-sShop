package co.edu.ue.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Usuario;

@Repository
public interface IUsuarioJpa extends JpaRepository<Usuario, Integer>{
	Usuario findByUsuariosCorreo(String usuariosCorreo);
	Usuario findByusuariosNombreUsuario(String usuariosNombreUsuario);
	Usuario findByusuariosEstado(int usuariosEstado);
}
