package com.prueba.peliculas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.peliculas.model.peliculaCategoria;
import com.prueba.peliculas.repository.peliculaCategoriaRepository;
import com.prueba.peliculas.service.peliculaCategoriaService;

@Service
public class peliculaCategoriaServiceImpl implements peliculaCategoriaService {
	
	@Autowired
	peliculaCategoriaRepository peliculaCategoriaRep;

	@Override
	public void saveMovieCateg(peliculaCategoria movieCateg) {
		peliculaCategoriaRep.save(movieCateg);
	}

	@Override
	public List<peliculaCategoria> allMovieCateg() {
		return peliculaCategoriaRep.findAll();
	}

}
