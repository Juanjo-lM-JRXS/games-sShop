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
	private int ordenesDetallesID;

	@Column(name="ordenesDetallesCantidad")
	private int ordenesDetallesCantidad;

	//bi-directional many-to-one association to Ordenes
	@ManyToOne
	@JoinColumn(name="ordenesID")
	private Ordene ordenesID;

	//bi-directional many-to-one association to Videojuegos
	@ManyToOne
	@JoinColumn(name="videojuegosID")
	private Videojuego videojuego;

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

	
	public Ordene getOrdenesID() {
		return ordenesID;
	}

	public void setOrdenesID(Ordene ordenesID) {
		this.ordenesID = ordenesID;
	}

	public Videojuego getVideojuego() {
		return this.videojuego;
	}

	public void setVideojuego(Videojuego videojuego) {
		this.videojuego = videojuego;
	}

}