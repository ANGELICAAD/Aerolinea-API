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
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "pasajero")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pasajero implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 481705727694581213L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPasajero")
	private Long idPasajero;
	
	@Column(nullable = false, name = "nombre")
	private String nombre;
	
	@Column(nullable = false, name = "apellido")
	private String apellido;
	
	@Column(nullable = false, name = "telefono")
	private String telefono;
	
	@Column(nullable = false, name = "correo")
	private String correo;
	
	@Column(nullable = false, name = "edad")
	private int edad;
	
	@Column(nullable = false, name = "numPasaporte")
	private String numPasaporte;
	
	@Column(nullable = false, name = "fechaVencimientoVisa")
	@DateTimeFormat(pattern = "%Y-%m-%d")
	private Date fechaVencimientoVisa;

	public Long getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(Long idPasajero) {
		this.idPasajero = idPasajero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNumPasaporte() {
		return numPasaporte;
	}

	public void setNumPasaporte(String numPasaporte) {
		this.numPasaporte = numPasaporte;
	}

	public Date getFechaVencimientoVisa() {
		return fechaVencimientoVisa;
	}

	public void setFechaVencimientoVisa(Date fechaVencimientoVisa) {
		this.fechaVencimientoVisa = fechaVencimientoVisa;
	}
}
