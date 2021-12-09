package com.SpringBoot.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "ciudadorigen")
@Inheritance(strategy = InheritanceType.JOINED)
public class CiudadOrigen implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8810548866281124037L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCiudadOrigen")
	private Long idCiudadOrigen;
	
	@Column(nullable = false, name = "ciudad")
	private String ciudad;

	public Long getIdCiudadOrigen() {
		return idCiudadOrigen;
	}

	public void setIdCiudadOrigen(Long idCiudadOrigen) {
		this.idCiudadOrigen = idCiudadOrigen;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
