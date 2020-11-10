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

import com.prueba.peliculas.model.vista;
import com.prueba.peliculas.service.vistaService;

@RestController
@RequestMapping("/vista")
public class vistaController {
	
	@Autowired
	vistaService vistaSer;
	
	@RequestMapping(method=RequestMethod.POST,path="/save")
	public ResponseEntity<vista> save(@RequestBody vista view){
		try{
			vistaSer.saveView(view);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch(Exception e ){
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/{id}")
	public ResponseEntity<List<vista>> all(@PathVariable int id){
		try{
			return ResponseEntity.ok(vistaSer.allViews(id));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}

}
