package com.colegio.service;


import java.util.List;

import com.colegio.entity.Libro;

public interface LibroService {

	public Libro insertarLibro(Libro obj);

	public List<Libro> listaLibro();

}
