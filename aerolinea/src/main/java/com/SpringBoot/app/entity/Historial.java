package com.SpringBoot.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "historial")
@Inheritance(strategy = InheritanceType.JOINED)
public class Historial implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3895605074010811339L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHistorial")
	private Long idHistorial;
	
	@Column(nullable = false, name = "cantViajes")
	private int cantViajes;
	
	@Column(nullable = false, name = "cantMillas")
	private double cantMillas;
	
	@ManyToOne
	@JoinColumn(name = "idPasajero", referencedColumnName = "idPasajero")
	private Pasajero idPasajero;

	public Long getIdHistorial() {
		return idHistorial;
	}

	public void setIdHistorial(Long idHistorial) {
		this.idHistorial = idHistorial;
	}

	public int getCantViajes() {
		return cantViajes;
	}

	public void setCantViajes(int cantViajes) {
		this.cantViajes = cantViajes;
	}

	public double getCantMillas() {
		return cantMillas;
	}

	public void setCantMillas(double cantMillas) {
		this.cantMillas = cantMillas;
	}

	public Pasajero getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(Pasajero idPasajero) {
		this.idPasajero = idPasajero;
	}
}
