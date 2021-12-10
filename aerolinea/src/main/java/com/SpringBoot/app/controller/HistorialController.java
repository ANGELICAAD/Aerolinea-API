package com.SpringBoot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.app.entity.Historial;
import com.SpringBoot.app.service.HistorialService;

@RestController
@RequestMapping("/api/historial")
@CrossOrigin({"*"})
public class HistorialController {

	@Autowired
	public HistorialService historialService;
	
	@GetMapping("/listHistorial/{idPasajero}")
	public ResponseEntity<?> listHistorial(@PathVariable Long idPasajero) {
		List<Object[]> historial = (List<Object[]>) historialService.listaHistoriaPasajero(idPasajero);
		
		if(historial.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(historial);
	}
}
