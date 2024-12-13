package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the plataformas database table.
 * 
 */
@Entity
@Table(name="plataformas")
@NamedQuery(name="Plataforma.findAll", query="SELECT p FROM Plataforma p")
public class Plataforma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int plataformasID;

	private String plataformasDescripcion;

	private String plataformasNombre;

	public Plataforma() {
	}

	public int getPlataformasID() {
		return this.plataformasID;
	}

	public void setPlataformasID(int plataformasID) {
		this.plataformasID = plataformasID;
	}

	public String getPlataformasDescripcion() {
		return this.plataformasDescripcion;
	}

	public void setPlataformasDescripcion(String plataformasDescripcion) {
		this.plataformasDescripcion = plataformasDescripcion;
	}

	public String getPlataformasNombre() {
		return this.plataformasNombre;
	}

	public void setPlataformasNombre(String plataformasNombre) {
		this.plataformasNombre = plataformasNombre;
	}

}