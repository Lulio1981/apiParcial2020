package com.colegio.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.entity.Libro;
import com.colegio.service.LibroService;

@RestController
@RequestMapping("/rest/colegio/libro")
public class LibroController {

	@Autowired
	private LibroService service;
	
	
	@PostMapping
	public ResponseEntity<Libro> inserta (@RequestBody Libro obj){
		return ResponseEntity.ok(service.insertarLibro(obj));
	}
	
	@GetMapping
	public ResponseEntity<List<Libro>> lista(){
		return ResponseEntity.ok(service.listaLibro());
	}
	
	
}
