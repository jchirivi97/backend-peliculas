package com.prueba.peliculas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vista")
public class vista {

	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	private String usuario;
	private int pelicula;
	
	public vista(int id, String usuario, int pelicula) {
		this.id = id;
		this.usuario = usuario;
		this.pelicula = pelicula;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getPelicula() {
		return pelicula;
	}

	public void setPelicula(int pelicula) {
		this.pelicula = pelicula;
	}
}
