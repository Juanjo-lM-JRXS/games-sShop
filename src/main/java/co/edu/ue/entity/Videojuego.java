package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;


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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int videojuegosID;

	private String videojuegosDescripcion;

	private String videojuegosNombre;

	private double videojuegosPrecio;

	//bi-directional many-to-one association to Ordenesdetalle
	@OneToMany(mappedBy="videojuego", cascade = CascadeType.REMOVE)
	@JsonBackReference
	private List<Ordenesdetalle> ordenesdetalles;

	//bi-directional many-to-one association to Plataforma
	@ManyToOne
	@JoinColumn(name="plataformasID")
	@JsonBackReference
	private Plataforma plataforma;

	public Videojuego() {
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

	public List<Ordenesdetalle> getOrdenesdetalles() {
		return this.ordenesdetalles;
	}

	public void setOrdenesdetalles(List<Ordenesdetalle> ordenesdetalles) {
		this.ordenesdetalles = ordenesdetalles;
	}

	public Ordenesdetalle addOrdenesdetalle(Ordenesdetalle ordenesdetalle) {
		getOrdenesdetalles().add(ordenesdetalle);
		ordenesdetalle.setVideojuego(this);

		return ordenesdetalle;
	}

	public Ordenesdetalle removeOrdenesdetalle(Ordenesdetalle ordenesdetalle) {
		getOrdenesdetalles().remove(ordenesdetalle);
		ordenesdetalle.setVideojuego(null);

		return ordenesdetalle;
	}

	public Plataforma getPlataforma() {
		return this.plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

}