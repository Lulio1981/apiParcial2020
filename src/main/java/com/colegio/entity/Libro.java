package com.colegio.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "libro")
public class Libro {

	@Id
	private int idLibro;
	
	private String codigo;
	
	private String titulo;
	
	private String estado;
	
	private String tipo;
	
	private int idTipoLibro;
}
