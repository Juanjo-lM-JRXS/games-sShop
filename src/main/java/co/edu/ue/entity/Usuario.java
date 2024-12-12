package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the ` usuarios` database table.
 * 
 */
@Entity
@Table(name="` usuarios`")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	public Usuario() {
	}

}