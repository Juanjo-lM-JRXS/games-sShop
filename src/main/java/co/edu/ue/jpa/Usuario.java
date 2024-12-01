package co.edu.ue.jpa;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


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

	private String usuariosContraseña;

	private String usuariosCorreo;

	private int usuariosEstado;

	private String usuariosNombreUsuario;

	private String usuariosPrimerApellido;

	private String usuariosPrimerNombre;

	private String usuariosSegundoApellido;

	private String usuariosSegundoNombre;

	//bi-directional many-to-one association to Orden
	@OneToMany(mappedBy="usuario")
	private List<Orden> ordens;

	public Usuario() {
	}

	public int getUsuariosID() {
		return this.usuariosID;
	}

	public void setUsuariosID(int usuariosID) {
		this.usuariosID = usuariosID;
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

	public String getUsuariosSegundoApellido() {
		return this.usuariosSegundoApellido;
	}

	public void setUsuariosSegundoApellido(String usuariosSegundoApellido) {
		this.usuariosSegundoApellido = usuariosSegundoApellido;
	}

	public String getUsuariosSegundoNombre() {
		return this.usuariosSegundoNombre;
	}

	public void setUsuariosSegundoNombre(String usuariosSegundoNombre) {
		this.usuariosSegundoNombre = usuariosSegundoNombre;
	}

	public List<Orden> getOrdens() {
		return this.ordens;
	}

	public void setOrdens(List<Orden> ordens) {
		this.ordens = ordens;
	}

	public Orden addOrden(Orden orden) {
		getOrdens().add(orden);
		orden.setUsuario(this);

		return orden;
	}

	public Orden removeOrden(Orden orden) {
		getOrdens().remove(orden);
		orden.setUsuario(null);

		return orden;
	}

}