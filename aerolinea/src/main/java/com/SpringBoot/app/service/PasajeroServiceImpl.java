package com.SpringBoot.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.app.entity.Pasajero;
import com.SpringBoot.app.repository.PasajeroRepository;

@Service
public class PasajeroServiceImpl implements PasajeroService {

	@Autowired
	private PasajeroRepository pasajeroRepository;
	
	@Override
	public Pasajero guardarPasajero(Pasajero pasajero) {
		return pasajeroRepository.save(pasajero);
	}

}
