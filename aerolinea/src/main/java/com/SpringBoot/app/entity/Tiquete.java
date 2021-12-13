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
@Table(name = "tiquete")
@Inheritance(strategy = InheritanceType.JOINED)
public class Tiquete implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 864304262662716574L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTiquete")
	private Long idTiquete;
	
	@Column(nullable = false, name = "totalPago")
	private double totalPago;
	
	@ManyToOne
	@JoinColumn(name = "idVuelo", referencedColumnName = "idVuelo")
	private Vuelo idVuelo;
	
	@ManyToOne
	@JoinColumn(name = "idPasajero", referencedColumnName = "idPasajero")
	private Pasajero idPasajero;

	public Long getIdTiquete() {
		return idTiquete;
	}

	public void setIdTiquete(Long idTiquete) {
		this.idTiquete = idTiquete;
	}

	public double getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(double totalPago) {
		this.totalPago = totalPago;
	}

	public Vuelo getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Vuelo idVuelo) {
		this.idVuelo = idVuelo;
	}

	public Pasajero getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(Pasajero idPasajero) {
		this.idPasajero = idPasajero;
	}
}
