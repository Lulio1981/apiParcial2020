package com.colegio.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.Libro;
import com.colegio.repository.LibroRepository;

@Service
public class LibroServiceImpl  implements LibroService{

	@Autowired
	private LibroRepository libroRepository;
	

	@Override
	public Libro insertarLibro(Libro obj) {
		return libroRepository.save(obj);
	}


	@Override
	public List<Libro> listaLibro() {
		// TODO Auto-generated method stub
		return libroRepository.findAll();
	}

}
