package com.SpringBoot.app.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.app.entity.Vuelo;
import com.SpringBoot.app.service.VueloService;

@RestController
@RequestMapping("/api/vuelos")
@CrossOrigin({"*"})
public class VueloController {

	@Autowired
	public VueloService vueloService;
	
	@GetMapping("/vuelosida/{ciudadorigen}&&{ciudaddestino}&&fecha")
	public ResponseEntity<?> listVuelosIda(@RequestParam("fechaVuelo") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha, @PathVariable String ciudadorigen, @PathVariable String ciudaddestino) {
		List<Object[]> vuelosIda = (List<Object[]>) vueloService.listaVuelosIdaFecha(fecha, ciudadorigen, ciudaddestino);
				
		if(vuelosIda.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(vuelosIda);
	}
	
	@GetMapping("/vuelosregreso/{ciudadorigen}&&{ciudaddestino}&&fecha")
	public ResponseEntity<?> listVuelosRegreso(@RequestParam("fechaVuelo") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha, @PathVariable String ciudadorigen, @PathVariable String ciudaddestino) {
		List<Object[]> vuelosRegreso = (List<Object[]>) vueloService.listaVuelosRegresoFecha(fecha, ciudadorigen, ciudaddestino);
				
		if(vuelosRegreso.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(vuelosRegreso);
	}
	
	@PostMapping
	public ResponseEntity<?> guardar(@RequestBody Vuelo vuelo) {
		return ResponseEntity.status(HttpStatus.CREATED).body(vueloService.guardarVuelo(vuelo));
	}
}
