package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the videojuegos_plataformas database table.
 * 
 */
@Entity
@Table(name="videojuegos_plataformas")
@NamedQuery(name="VideojuegosPlataforma.findAll", query="SELECT v FROM VideojuegosPlataforma v")
public class VideojuegosPlataforma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int videojuegos_plataformasID;

	@Column(name="videojuegos_plataformasEstado")
	private int videojuegos_plataformasEstado;

	//bi-directional many-to-one association to Ordenesdetalle
	@OneToMany(mappedBy="videojuegosPlataforma")
	private List<Ordenesdetalle> ordenesdetalles;

	//bi-directional many-to-one association to Plataforma
	@ManyToOne
	@JoinColumn(name="plataformasID")
	private Plataforma plataforma;

	//bi-directional many-to-one association to Videojuegosdetalle
	@ManyToOne
	@JoinColumn(name="videojuegosID")
	private Videojuegosdetalle videojuegosdetalle;

	public VideojuegosPlataforma() {
	}

	public int getVideojuegos_plataformasID() {
		return this.videojuegos_plataformasID;
	}

	public void setVideojuegos_plataformasID(int videojuegos_plataformasID) {
		this.videojuegos_plataformasID = videojuegos_plataformasID;
	}

	public int getVideojuegos_plataformasEstado() {
		return this.videojuegos_plataformasEstado;
	}

	public void setVideojuegos_plataformasEstado(int videojuegos_plataformasEstado) {
		this.videojuegos_plataformasEstado = videojuegos_plataformasEstado;
	}

	public List<Ordenesdetalle> getOrdenesdetalles() {
		return this.ordenesdetalles;
	}

	public void setOrdenesdetalles(List<Ordenesdetalle> ordenesdetalles) {
		this.ordenesdetalles = ordenesdetalles;
	}

	public Ordenesdetalle addOrdenesdetalle(Ordenesdetalle ordenesdetalle) {
		getOrdenesdetalles().add(ordenesdetalle);
		ordenesdetalle.setVideojuegosPlataforma(this);

		return ordenesdetalle;
	}

	public Ordenesdetalle removeOrdenesdetalle(Ordenesdetalle ordenesdetalle) {
		getOrdenesdetalles().remove(ordenesdetalle);
		ordenesdetalle.setVideojuegosPlataforma(null);

		return ordenesdetalle;
	}

	public Plataforma getPlataforma() {
		return this.plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	public Videojuegosdetalle getVideojuegosdetalle() {
		return this.videojuegosdetalle;
	}

	public void setVideojuegosdetalle(Videojuegosdetalle videojuegosdetalle) {
		this.videojuegosdetalle = videojuegosdetalle;
	}

}