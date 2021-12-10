package com.SpringBoot.app.service;

import java.util.List;

import com.SpringBoot.app.entity.CiudadOrigen;

public interface CiudadOrigenService {

	public List<String> listaCiudadesOrigen();
	
	public List<String> listaCiudadesDestino(String ciudadOrigen);
}
