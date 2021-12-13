package com.SpringBoot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.app.entity.Historial;
import com.SpringBoot.app.repository.HistorialRepository;

@Service
public class HistorialServiceImpl implements HistorialService {

	@Autowired
	private HistorialRepository historialRepository;
	
	@Override
	public List<Object[]> listaHistoriaPasajero(Long idPasajero) {
		return historialRepository.listaHistoriaPasajero(idPasajero);
	}

	@Override
	public Historial guardarHistorial(Historial historial) {
		return historialRepository.save(historial);
	}

}
