package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the videojuegos database table.
 * 
 */
@Entity
@Table(name="videojuegos")
@NamedQuery(name="Videojuego.findAll", query="SELECT v FROM Videojuego v")
public class Videojuego implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int videojuegosID;

	private int plataformasID;

	private String videojuegosDescripcion;

	private String videojuegosNombre;

	private double videojuegosPrecio;

	public Videojuego() {
	}

	public int getVideojuegosID() {
		return this.videojuegosID;
	}

	public void setVideojuegosID(int videojuegosID) {
		this.videojuegosID = videojuegosID;
	}

	public int getPlataformasID() {
		return this.plataformasID;
	}

	public void setPlataformasID(int plataformasID) {
		this.plataformasID = plataformasID;
	}

	public String getVideojuegosDescripcion() {
		return this.videojuegosDescripcion;
	}

	public void setVideojuegosDescripcion(String videojuegosDescripcion) {
		this.videojuegosDescripcion = videojuegosDescripcion;
	}

	public String getVideojuegosNombre() {
		return this.videojuegosNombre;
	}

	public void setVideojuegosNombre(String videojuegosNombre) {
		this.videojuegosNombre = videojuegosNombre;
	}

	public double getVideojuegosPrecio() {
		return this.videojuegosPrecio;
	}

	public void setVideojuegosPrecio(double videojuegosPrecio) {
		this.videojuegosPrecio = videojuegosPrecio;
	}

}