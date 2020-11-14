package com.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegio.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{

	
}
