package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the ordenesdetalles database table.
 * 
 */
@Entity
@Table(name="ordenesdetalles")
@NamedQuery(name="Ordenesdetalle.findAll", query="SELECT o FROM Ordenesdetalle o")
public class Ordenesdetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ordenesDetallesID")
	private int ordenesDetallesID;

	@Column(name="ordenesDetallesCantidad")
	private int ordenesDetallesCantidad;

	//bi-directional many-to-one association to Orden
	@ManyToOne
	@JoinColumn(name="ordenesID")
	private Orden orden;

	//bi-directional many-to-one association to VideojuegosPlataforma
	@ManyToOne
	@JoinColumn(name="videojuegos_plataformasID")
	private VideojuegosPlataforma videojuegosPlataforma;

	public Ordenesdetalle() {
	}

	public int getOrdenesDetallesID() {
		return this.ordenesDetallesID;
	}

	public void setOrdenesDetallesID(int ordenesDetallesID) {
		this.ordenesDetallesID = ordenesDetallesID;
	}

	public int getOrdenesDetallesCantidad() {
		return this.ordenesDetallesCantidad;
	}

	public void setOrdenesDetallesCantidad(int ordenesDetallesCantidad) {
		this.ordenesDetallesCantidad = ordenesDetallesCantidad;
	}

	public Orden getOrden() {
		return this.orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public VideojuegosPlataforma getVideojuegosPlataforma() {
		return this.videojuegosPlataforma;
	}

	public void setVideojuegosPlataforma(VideojuegosPlataforma videojuegosPlataforma) {
		this.videojuegosPlataforma = videojuegosPlataforma;
	}

}