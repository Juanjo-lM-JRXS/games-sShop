
package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int plataformasID;

	@Column(name="plataformasDescripcion")
	private String plataformasDescripcion;

	@Column(name="plataformasNombre")
	private String plataformasNombre;

	//bi-directional many-to-one association to Videojuego
	@OneToMany(mappedBy="plataforma")
	private List<Videojuego> videojuegos;

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

	public List<Videojuego> getVideojuegos() {
		return this.videojuegos;
	}

	public void setVideojuegos(List<Videojuego> videojuegos) {
		this.videojuegos = videojuegos;
	}

	public Videojuego addVideojuego(Videojuego videojuego) {
		getVideojuegos().add(videojuego);
		videojuego.setPlataforma(this);

		return videojuego;
	}

	public Videojuego removeVideojuego(Videojuego videojuego) {
		getVideojuegos().remove(videojuego);
		videojuego.setPlataforma(null);

		return videojuego;
	}

}