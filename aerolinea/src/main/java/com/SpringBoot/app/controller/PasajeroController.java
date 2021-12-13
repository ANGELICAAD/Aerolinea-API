package com.SpringBoot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.app.entity.Pasajero;
import com.SpringBoot.app.service.PasajeroService;

@RestController
@RequestMapping("/api/pasajero")
@CrossOrigin({"*"})
public class PasajeroController {

	@Autowired
	public PasajeroService pasajeroService;
	
	@PostMapping
	public ResponseEntity<?> guardar(@RequestBody Pasajero pasajero) {
		return ResponseEntity.status(HttpStatus.CREATED).body(pasajeroService.guardarPasajero(pasajero));
	}
}
