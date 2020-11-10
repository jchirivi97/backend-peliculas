package com.prueba.peliculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.peliculas.model.peliculaCategoria;

public interface peliculaCategoriaRepository extends JpaRepository<peliculaCategoria,Integer> {
	
}
