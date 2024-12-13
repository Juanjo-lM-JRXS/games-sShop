package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Usuario;

public interface IUsuarioService {
    List<Usuario> saveUsuario(Usuario usuario);
    Usuario upUsuario(Usuario usuario);
    Usuario upEstadoUsuario(Usuario usuario);
    Usuario deleteUsuario(int id);
    
    List<Usuario> listaAllUsers();
    Usuario findPorId(int usuariosID);
    Usuario findPorNombreUsuario(String usuariosNombreUsuario);
    Usuario findUsuariosCorreo(String usuariosCorreo);
    List<Usuario> findEstado1(int usuariosEstado);  
    List<Usuario> findEstado(int busquedaestado);  
    List<Usuario> busquedaEstado(int estado);}