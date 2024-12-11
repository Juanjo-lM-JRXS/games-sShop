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

	private int ordenesDetallesCantidad;

	//bi-directional many-to-one association to Ordene
	@ManyToOne
	@JoinColumn(name="ordenesID")
	private Ordene ordene;

	//bi-directional many-to-one association to Videojuego
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

	public Ordene getOrdene() {
		return this.ordene;
	}

	public void setOrdene(Ordene ordene) {
		this.ordene = ordene;
	}

	public Videojuego getVideojuego() {
		return this.videojuego;
	}

	public void setVideojuego(Videojuego videojuego) {
		this.videojuego = videojuego;
	}

}