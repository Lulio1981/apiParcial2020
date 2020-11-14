package com.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.TipoLibro;
import com.colegio.repository.TipoLibroRepository;

@Service
public class TipoLibroServiceImpl  implements TipoLibroService{


	
	@Autowired
	private TipoLibroRepository tipoLibroRepository;


	@Override
	public List<TipoLibro> listaTipoLibro() {
		// TODO Auto-generated method stub
		return tipoLibroRepository.findAll();
	}
	
}
