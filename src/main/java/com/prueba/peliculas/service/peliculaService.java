package com.prueba.peliculas.service;

import java.util.List;

import com.prueba.peliculas.model.pelicula;

public interface peliculaService {

	void saveMovie(pelicula movie);
	List<pelicula> allMovies();
	pelicula getMovie(int id);
}
