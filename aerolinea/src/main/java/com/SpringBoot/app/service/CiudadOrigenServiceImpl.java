package com.SpringBoot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.app.entity.CiudadOrigen;
import com.SpringBoot.app.repository.CiudadOrigenRepository;

@Service
public class CiudadOrigenServiceImpl implements CiudadOrigenService {

	@Autowired
	private CiudadOrigenRepository ciudadOrigenRepository;
	
	@Override
	public List<String> listaCiudadesOrigen() {
		return ciudadOrigenRepository.listaCiudadesOrigen();
	}

	@Override
	public List<String> listaCiudadesDestino(String ciudadOrigen) {
		return ciudadOrigenRepository.listaCiudadesDestino(ciudadOrigen);
	}

}
