package com.prueba.peliculas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.peliculas.model.pelicula;
import com.prueba.peliculas.repository.peliculaRepository;
import com.prueba.peliculas.service.peliculaService;

@Service
public class peliculaServiceImpl implements peliculaService{

	@Autowired
	peliculaRepository peliculaRep;
	
	@Override
	public void saveMovie(pelicula movie) {
		peliculaRep.save(movie);		
	}

	@Override
	public List<pelicula> allMovies() {
		return peliculaRep.findAll();
	}

	@Override
	public pelicula getMovie(int id) {
		return peliculaRep.findById(id).get();
	}

}
