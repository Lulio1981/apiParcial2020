package com.colegio.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipolibro")
public class TipoLibro {

	@Id
	private int idTipoLibro;

	private String nombre;

	private String estado;
}
