package com.SpringBoot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.app.entity.Tiquete;
import com.SpringBoot.app.service.TiqueteService;

@RestController
@RequestMapping("/api/tiquetes")
@CrossOrigin({"*"})
public class TiqueteController {

	@Autowired
	public TiqueteService tiqueteService;
	
	@PostMapping
	public ResponseEntity<?> guardar(@RequestBody Tiquete tiquete){
		return ResponseEntity.status(HttpStatus.CREATED).body(tiqueteService.guardarTiquete(tiquete));
	}
}
