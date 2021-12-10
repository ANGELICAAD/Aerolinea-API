package com.SpringBoot.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBoot.app.entity.Vuelo;
import com.SpringBoot.app.repository.VueloRepository;

@Service
public class VueloServiceImpl implements VueloService {

	@Autowired
	private VueloRepository vueloRepository;
	
	@Override
	public List<Object[]> listaVuelosIdaFecha(Date fechaSeleccionada, String ciudadOrigen) {
		return vueloRepository.listaVuelosIdaFecha(fechaSeleccionada, ciudadOrigen);
	}

	@Override
	@Transactional
	public Vuelo guardarVuelo(Vuelo vuelo) {
		return vueloRepository.save(vuelo);
	}
}
