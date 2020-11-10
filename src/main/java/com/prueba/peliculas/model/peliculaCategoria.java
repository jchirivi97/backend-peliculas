package com.prueba.peliculas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="peliculaCategoria")
public class peliculaCategoria {

	@Id
	private int id;
	private int pelicula;
	private int categoria;
	
	
	public peliculaCategoria(){
		
	}
	public peliculaCategoria(int id, int pelicula, int categoria) {
		this.id = id;
		this.pelicula = pelicula;
		this.categoria = categoria;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPelicula() {
		return pelicula;
	}
	public void setPelicula(int pelicula) {
		this.pelicula = pelicula;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	
}
