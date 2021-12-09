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
@Table(name = "ciudaddestino")
@Inheritance(strategy = InheritanceType.JOINED)
public class CiudadDestino implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2976901032545128459L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCiudadDestino")
	private Long idCiudadDestino;
	
	@Column(nullable = false, name = "ciudad")
	private String ciudad;
	
	@Column(nullable = false, name = "visa")
	private boolean visa;
	
	@ManyToOne
	@JoinColumn(name = "idCiudadOrigen", referencedColumnName = "idCiudadOrigen")
	private CiudadOrigen idCiudadOrigen;

	public Long getIdCiudadDestino() {
		return idCiudadDestino;
	}

	public void setIdCiudadDestino(Long idCiudadDestino) {
		this.idCiudadDestino = idCiudadDestino;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public boolean isVisa() {
		return visa;
	}

	public void setVisa(boolean visa) {
		this.visa = visa;
	}

	public CiudadOrigen getIdCiudadOrigen() {
		return idCiudadOrigen;
	}

	public void setIdCiudadOrigen(CiudadOrigen idCiudadOrigen) {
		this.idCiudadOrigen = idCiudadOrigen;
	}
}
