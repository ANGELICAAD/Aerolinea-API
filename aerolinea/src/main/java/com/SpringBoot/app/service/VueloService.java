package com.SpringBoot.app.service;

import java.util.Date;
import java.util.List;

import com.SpringBoot.app.entity.Vuelo;

public interface VueloService {

	public List<Object[]> listaVuelosIdaFecha(Date fechaSeleccionada, String ciudadOrigen, String ciudadDestino);
	
	public List<Object[]> listaVuelosRegresoFecha(Date fechaSeleccionada, String ciudadOrigen, String ciudadDestino);
	
	public Vuelo guardarVuelo(Vuelo vuelo);
}
