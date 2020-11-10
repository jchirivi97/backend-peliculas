package com.prueba.peliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.peliculas.model.pelicula;
import com.prueba.peliculas.service.peliculaService;

@RestController
@RequestMapping("/pelicula")
public class peliculaController {
	
	@Autowired
	peliculaService peliculaSer;
	
	@RequestMapping(method=RequestMethod.GET,path="/allMovies")
	public ResponseEntity<List<pelicula>> getUser(){
		try{
			return ResponseEntity.ok(peliculaSer.allMovies());
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/{id}")
	public ResponseEntity<pelicula> getMovie(@PathVariable(name="id") int id){
		try{
			return ResponseEntity.ok(peliculaSer.getMovie(id));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/save")
	public ResponseEntity<pelicula> saveMovie(@RequestBody pelicula movie){
		try{
			peliculaSer.saveMovie(movie);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}

}
