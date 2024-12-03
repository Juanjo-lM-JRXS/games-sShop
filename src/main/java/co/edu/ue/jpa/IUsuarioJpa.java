package co.edu.ue.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.Usuario;

public interface IUsuarioJpa extends JpaRepository<Usuario, Integer>{
	Usuario findByUsuarioID(int usuariosID);
	Usuario findByCorreo(String usuariosCorreo);
	Usuario findByNombreUsuario(String usuariosNombreUsuario);
}
