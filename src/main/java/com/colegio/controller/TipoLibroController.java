package com.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.entity.TipoLibro;
import com.colegio.service.TipoLibroService;

@RestController
@RequestMapping("/rest/colegio/tipoLibro")
public class TipoLibroController {

	@Autowired
	private TipoLibroService service;
	

	@GetMapping
	public ResponseEntity<List<TipoLibro>> lista(){
		return ResponseEntity.ok(service.listaTipoLibro());
	}
}
