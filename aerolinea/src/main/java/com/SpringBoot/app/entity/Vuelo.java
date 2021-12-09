package com.SpringBoot.app.entity;

import java.io.Serializable;
import java.util.Date;

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

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "vuelo")
@Inheritance(strategy = InheritanceType.JOINED)
public class Vuelo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4761706577561607154L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idVuelo")
	private Long idVuelo;
	
	@Column(nullable = false, name = "numVuelo")
	private int numVuelo;
	
	@Column(nullable = false, name = "sillasDisponibles")
	private String sillasDisponibles;
	
	@Column(nullable = false, name = "precioUnitario")
	private double precioUnitario;
	
	@Column(nullable = false, name = "fechaHora")
	// @DateTimeFormat(pattern = "%Y-%m-%d %H:%m:%s")
	@DateTimeFormat(pattern = "%Y-%m-%d hh:mm:ss")
	private Date fechaHora;
	
	@Column(nullable = false, name = "duracion")
	private String duracion;
	
	@Column(nullable = false, name = "tipoRuta")
	private String tipoRuta;
	
	@ManyToOne
	@JoinColumn(name = "idRuta", referencedColumnName = "idRuta")
	private Ruta idRuta;
	
	@Column(nullable = false, name = "tipoVuelo")
	private String tipoVuelo;

	public Long getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Long idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getNumVuelo() {
		return numVuelo;
	}

	public void setNumVuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}

	public String getSillasDisponibles() {
		return sillasDisponibles;
	}

	public void setSillasDisponibles(String sillasDisponibles) {
		this.sillasDisponibles = sillasDisponibles;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getTipoRuta() {
		return tipoRuta;
	}
	
	public void setTipoRuta(String tipoRuta) {
		this.tipoRuta = tipoRuta;
	}
	public Ruta getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(Ruta idRuta) {
		this.idRuta = idRuta;
	}

	public String getTipoVuelo() {
		return tipoVuelo;
	}

	public void setTipoVuelo(String tipoVuelo) {
		this.tipoVuelo = tipoVuelo;
	}
}
