package com.prueba.peliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.peliculas.model.categoria;
import com.prueba.peliculas.service.categoriaService;

@RestController
@RequestMapping("/categoria")
public class categoriaController {
	
	@Autowired
	categoriaService categoriaServ;
	
	@RequestMapping(method=RequestMethod.GET,path="/all")
	public ResponseEntity<List<categoria>> all(){
		try{
			return ResponseEntity.ok(categoriaServ.allCategorys());
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/save")
	public ResponseEntity<categoria> save(@RequestBody categoria category){
		try{
			categoriaServ.saveCategory(category);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
}
