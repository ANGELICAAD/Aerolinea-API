package com.SpringBoot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.app.entity.CiudadOrigen;
import com.SpringBoot.app.service.CiudadOrigenService;

@RestController
@RequestMapping("/api/ciudadorigen")
@CrossOrigin({"*"})
public class CiudadOrigenController {

	@Autowired
	public CiudadOrigenService ciudadOrigenService;
	
	@GetMapping("/origen")
	public ResponseEntity<?> listCiudadOrigen() {
		List<String> ciudadOrigen = (List<String>) ciudadOrigenService.listaCiudadesOrigen();
		
		if(ciudadOrigen.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(ciudadOrigen);
	}
	
	@GetMapping("/destino/{ciudadorigen}")
	public ResponseEntity<?> listCiudadDestino(@PathVariable String ciudadorigen) {
		List<String> ciudadDestino = (List<String>) ciudadOrigenService.listaCiudadesDestino(ciudadorigen);
		
		if(ciudadDestino.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(ciudadDestino);
	}
}
