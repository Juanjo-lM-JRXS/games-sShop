package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ordenes database table.
 * 
 */
@Entity
@Table(name="ordenes")
@NamedQuery(name="Ordene.findAll", query="SELECT o FROM Ordene o")
public class Ordene implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ordenesID;
 
	@Temporal(TemporalType.TIMESTAMP)
	private Date ordenDate;

	@Column(name="ordenEstado")
	private int ordenEstado;

	//bi-directional many-to-one association to Ordenesdetalle
	@OneToMany(mappedBy="ordenesID")
	private List<Ordenesdetalle> ordenesdetalles;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuariosID", referencedColumnName="usuariosID")
	private Usuario usuario;

	public Ordene() {
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

	public List<Ordenesdetalle> getOrdenesdetalles() {
		return this.ordenesdetalles;
	}

	public void setOrdenesdetalles(List<Ordenesdetalle> ordenesdetalles) {
		this.ordenesdetalles = ordenesdetalles;
	}

	public Ordenesdetalle addOrdenesdetalle(Ordenesdetalle ordenesdetalle) {
		getOrdenesdetalles().add(ordenesdetalle);
		ordenesdetalle.setOrdenesID(this);

		return ordenesdetalle;
	}

	public Ordenesdetalle removeOrdenesdetalle(Ordenesdetalle ordenesdetalle) {
		getOrdenesdetalles().remove(ordenesdetalle);
		ordenesdetalle.setOrdenesID(null);

		return ordenesdetalle;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}