package com.prueba.peliculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.peliculas.model.categoria;

public interface categoriaRepository extends JpaRepository<categoria,Integer> {

}
