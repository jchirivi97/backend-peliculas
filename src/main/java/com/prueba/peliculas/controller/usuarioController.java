package com.prueba.peliculas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.peliculas.model.usuario;
import com.prueba.peliculas.service.usuarioService;


@RestController
@RequestMapping("/usuario")
public class usuarioController {

	@Autowired
	usuarioService usuarioServ;
	
	@RequestMapping(method=RequestMethod.GET,path="/{nickname}/{password}")
	public ResponseEntity<usuario> login(@PathVariable(name="nickname") String nickname,@PathVariable(name="password") String password){
		try{
			usuario user = new usuario(nickname,null,password);
			return ResponseEntity.ok(usuarioServ.login(user));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/{nickname}")
	public ResponseEntity<usuario> getUser(@PathVariable(name="nickname") String nickname){
		try{
			return ResponseEntity.ok(usuarioServ.getUser(nickname));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/save")
	public ResponseEntity<usuario> addUser(@RequestBody usuario user){
		try{
			usuarioServ.saveUser(user);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
