package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IUsuarioDao;
import co.edu.ue.entity.Usuario;

@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired
    private IUsuarioDao dao;  // Usamos la interfaz del DAO para realizar operaciones en la base de datos.

    // Guardar un nuevo usuario
    @Override
    public List<Usuario> saveUsuario(Usuario usuario) {
        dao.guardarUsuario(usuario);  // Usamos el método del DAO para guardar un usuario
        return listaAllUsers();  // Retornamos la lista actualizada de todos los usuarios
    }

    // Actualizar un usuario
    @Override
    public Usuario upUsuario(Usuario usuario) {
        int id = usuario.getUsuariosID();  // Obtenemos el ID del usuario
        if (findPorId(id) != null) {  // Verificamos si el usuario existe
            return dao.actualizarUsuario(usuario);  // Si existe, lo actualizamos
        }
        return null;  // Si no existe, retornamos null
    }

    // Obtener todos los usuarios
    @Override
    public List<Usuario> listaAllUsers() {
        return dao.listaUsuarioCompleta();  // Usamos el método del DAO para obtener todos los usuarios
    }

    // Buscar usuario por ID
    @Override
    public Usuario findPorId(int usuariosID) {
        return dao.busquedaPorId(usuariosID);  // Usamos el método del DAO para buscar el usuario por ID
    }

    // Buscar usuario por nombre de usuario
    @Override
    public Usuario findPorNombreUsuario(String usuariosNombreUsuario) {
        return dao.busquedaPorNombreUsuario(usuariosNombreUsuario);  // Buscamos por nombre de usuario
    }

    // Buscar usuario por correo electrónico
    @Override
    public Usuario findUsuariosCorreo(String usuariosCorreo) {
        return dao.busquedaUsuariosCorreo(usuariosCorreo);  // Buscamos por correo
    }

    // Buscar usuario por estado
    @Override
    public List<Usuario> busquedaEstado(int usuariosEstado) {
    	return dao.busquedaEstado(usuariosEstado);
    }

    // Actualizar el estado de un usuario
    @Override
    public Usuario upEstadoUsuario(Usuario usuario) {
        return dao.actualizarUsuario(usuario);  // Usamos el método del DAO para actualizar el usuario
    }

	@Override
	public List<Usuario> findEstado1(int usuariosEstado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> findEstado(int busquedaestado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario deleteUsuario(int id) {
		return dao.eliminarUsuario(id);
	}
	
	
}
