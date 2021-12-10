package com.SpringBoot.app.service;

import java.util.List;

import com.SpringBoot.app.entity.Historial;

public interface HistorialService {

	public List<Object[]> listaHistoriaPasajero(Long idPasajero);
}
