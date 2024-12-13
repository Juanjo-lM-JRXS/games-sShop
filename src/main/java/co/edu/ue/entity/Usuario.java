package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int usuariosID;
	
	@Column(name="usuariosContraseña")
	private String usuariosContraseña;

	@Column(name="usuariosCorreo")
	private String usuariosCorreo;

	@Column(name="usuariosEstado")
	private int usuariosEstado;

	@Column(name="usuariosNombreUsuario")
	private String usuariosNombreUsuario;

	@Column(name="usuariosPrimerApellido")
	private String usuariosPrimerApellido;

	@Column(name="usuariosPrimerNombre")
	private String usuariosPrimerNombre;

	@Column(name="usuariosSegundoNombre")
	private String usuariosSegundoNombre;

	@Column(name="usuariosSegundorApellido")
	private String usuariosSegundorApellido;

	public Usuario() {
		super();
	}

	public String getUsuariosContraseña() {
		return this.usuariosContraseña;
	}

	public void setUsuariosContraseña(String usuariosContraseña) {
		this.usuariosContraseña = usuariosContraseña;
	}

	public String getUsuariosCorreo() {
		return this.usuariosCorreo;
	}

	public void setUsuariosCorreo(String usuariosCorreo) {
		this.usuariosCorreo = usuariosCorreo;
	}

	public int getUsuariosEstado() {
		return this.usuariosEstado;
	}

	public void setUsuariosEstado(int usuariosEstado) {
		this.usuariosEstado = usuariosEstado;
	}

	public int getUsuariosID() {
		return this.usuariosID;
	}

	public void setUsuariosID(int usuariosID) {
		this.usuariosID = usuariosID;
	}

	public String getUsuariosNombreUsuario() {
		return this.usuariosNombreUsuario;
	}

	public void setUsuariosNombreUsuario(String usuariosNombreUsuario) {
		this.usuariosNombreUsuario = usuariosNombreUsuario;
	}

	public String getUsuariosPrimerApellido() {
		return this.usuariosPrimerApellido;
	}

	public void setUsuariosPrimerApellido(String usuariosPrimerApellido) {
		this.usuariosPrimerApellido = usuariosPrimerApellido;
	}

	public String getUsuariosPrimerNombre() {
		return this.usuariosPrimerNombre;
	}

	public void setUsuariosPrimerNombre(String usuariosPrimerNombre) {
		this.usuariosPrimerNombre = usuariosPrimerNombre;
	}

	public String getUsuariosSegundoNombre() {
		return this.usuariosSegundoNombre;
	}

	public void setUsuariosSegundoNombre(String usuariosSegundoNombre) {
		this.usuariosSegundoNombre = usuariosSegundoNombre;
	}

	public String getUsuariosSegundorApellido() {
		return this.usuariosSegundorApellido;
	}

	public void setUsuariosSegundorApellido(String usuariosSegundorApellido) {
		this.usuariosSegundorApellido = usuariosSegundorApellido;
	}

	@Override
	public String toString() {
		return "Usuario [usuariosID=" + usuariosID + ", usuariosContraseña=" + usuariosContraseña + ", usuariosCorreo="
				+ usuariosCorreo + ", usuariosEstado=" + usuariosEstado + ", usuariosNombreUsuario="
				+ usuariosNombreUsuario + ", usuariosPrimerApellido=" + usuariosPrimerApellido
				+ ", usuariosPrimerNombre=" + usuariosPrimerNombre + ", usuariosSegundoNombre=" + usuariosSegundoNombre
				+ ", usuariosSegundorApellido=" + usuariosSegundorApellido + "]";
	}

	
}