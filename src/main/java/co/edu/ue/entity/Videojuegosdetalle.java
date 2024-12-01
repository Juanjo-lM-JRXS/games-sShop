package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the videojuegosdetalles database table.
 * 
 */
@Entity
@Table(name="videojuegosdetalles")
@NamedQuery(name="Videojuegosdetalle.findAll", query="SELECT v FROM Videojuegosdetalle v")
public class Videojuegosdetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int videojuegosID;

	private String videojuegosDescripcion;

	private String videojuegosNombre;

	private double videojuegosPrecio;

	//bi-directional many-to-one association to VideojuegosPlataforma
	@OneToMany(mappedBy="videojuegosdetalle")
	private List<VideojuegosPlataforma> videojuegosPlataformas;

	public Videojuegosdetalle() {
	}

	public int getVideojuegosID() {
		return this.videojuegosID;
	}

	public void setVideojuegosID(int videojuegosID) {
		this.videojuegosID = videojuegosID;
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

	public List<VideojuegosPlataforma> getVideojuegosPlataformas() {
		return this.videojuegosPlataformas;
	}

	public void setVideojuegosPlataformas(List<VideojuegosPlataforma> videojuegosPlataformas) {
		this.videojuegosPlataformas = videojuegosPlataformas;
	}

	public VideojuegosPlataforma addVideojuegosPlataforma(VideojuegosPlataforma videojuegosPlataforma) {
		getVideojuegosPlataformas().add(videojuegosPlataforma);
		videojuegosPlataforma.setVideojuegosdetalle(this);

		return videojuegosPlataforma;
	}

	public VideojuegosPlataforma removeVideojuegosPlataforma(VideojuegosPlataforma videojuegosPlataforma) {
		getVideojuegosPlataformas().remove(videojuegosPlataforma);
		videojuegosPlataforma.setVideojuegosdetalle(null);

		return videojuegosPlataforma;
	}

}