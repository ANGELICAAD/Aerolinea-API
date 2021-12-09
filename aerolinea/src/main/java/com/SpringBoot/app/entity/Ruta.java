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
@Table(name = "ruta")
@Inheritance(strategy = InheritanceType.JOINED)
public class Ruta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2740694285439769468L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRuta")
	private Long idRuta;
	
	@ManyToOne
	@JoinColumn(name = "idCiudadOrigen", referencedColumnName = "idCiudadOrigen")
	private CiudadOrigen idCiudadOrigen;

	public Long getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(Long idRuta) {
		this.idRuta = idRuta;
	}

	public CiudadOrigen getIdCiudadOrigen() {
		return idCiudadOrigen;
	}

	public void setIdCiudadOrigen(CiudadOrigen idCiudadOrigen) {
		this.idCiudadOrigen = idCiudadOrigen;
	}
}
