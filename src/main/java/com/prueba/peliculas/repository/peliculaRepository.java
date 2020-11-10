package com.prueba.peliculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.peliculas.model.pelicula;

public interface peliculaRepository extends JpaRepository<pelicula,Integer>{

}
