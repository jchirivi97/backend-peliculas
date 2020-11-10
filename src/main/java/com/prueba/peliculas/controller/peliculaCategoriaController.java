package com.prueba.peliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.peliculas.model.peliculaCategoria;
import com.prueba.peliculas.service.peliculaCategoriaService;

@RestController
@RequestMapping("/movieCateg")
public class peliculaCategoriaController {

	@Autowired
	peliculaCategoriaService peliculaCategoriaSer;
	
	@RequestMapping(method=RequestMethod.POST,path="/save")
	public ResponseEntity<peliculaCategoria> save(@RequestBody peliculaCategoria peliculaCateg){
		try{
			peliculaCategoriaSer.saveMovieCateg(peliculaCateg);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/all")
	public ResponseEntity<List<peliculaCategoria>> allMovieCateg(){
		try{
			return ResponseEntity.ok(peliculaCategoriaSer.allMovieCateg());
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
}
