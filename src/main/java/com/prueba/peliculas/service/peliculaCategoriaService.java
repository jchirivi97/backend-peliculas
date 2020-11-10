package com.prueba.peliculas.service;

import java.util.List;

import com.prueba.peliculas.model.peliculaCategoria;

public interface peliculaCategoriaService {
	
	void saveMovieCateg(peliculaCategoria movieCateg);
	List<peliculaCategoria> allMovieCateg();
	
}
