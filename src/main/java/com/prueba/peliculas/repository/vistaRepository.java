package com.prueba.peliculas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prueba.peliculas.model.vista;

public interface vistaRepository extends JpaRepository<vista,Integer> {
	
	@Query(value="select v.id, v.pelicula, v.usuario from vista v where v.pelicula = :usuario",nativeQuery=true)
	List<vista> allVistas(int usuario);
}
