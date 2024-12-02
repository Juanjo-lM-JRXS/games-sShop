package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the orden database table.
 * 
 */
@Entity
@Table(name="orden")
@NamedQuery(name="Orden.findAll", query="SELECT o FROM Orden o")
public class Orden implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ordenesID")
	private int ordenesID;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ordenDate")
	private Date ordenDate;

	@Column(name="ordenEstado")
	private int ordenEstado;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuariosID")
	private Usuario usuario;

	//bi-directional many-to-one association to Ordenesdetalle
	@OneToMany(mappedBy="orden")
	private List<Ordenesdetalles> ordenesdetalles;

	public Orden() {
	}

	public int getOrdenesID() {
		return this.ordenesID;
	}

	public void setOrdenesID(int ordenesID) {
		this.ordenesID = ordenesID;
	}

	public Date getOrdenDate() {
		return this.ordenDate;
	}

	public void setOrdenDate(Date ordenDate) {
		this.ordenDate = ordenDate;
	}

	public int getOrdenEstado() {
		return this.ordenEstado;
	}

	public void setOrdenEstado(int ordenEstado) {
		this.ordenEstado = ordenEstado;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Ordenesdetalles> getOrdenesdetalles() {
		return this.ordenesdetalles;
	}

	public void setOrdenesdetalles(List<Ordenesdetalles> ordenesdetalles) {
		this.ordenesdetalles = ordenesdetalles;
	}

	public Ordenesdetalles addOrdenesdetalle(Ordenesdetalles ordenesdetalle) {
		getOrdenesdetalles().add(ordenesdetalle);
		ordenesdetalle.setOrden(this);

		return ordenesdetalle;
	}

	public Ordenesdetalles removeOrdenesdetalle(Ordenesdetalles ordenesdetalle) {
		getOrdenesdetalles().remove(ordenesdetalle);
		ordenesdetalle.setOrden(null);

		return ordenesdetalle;
	}

}