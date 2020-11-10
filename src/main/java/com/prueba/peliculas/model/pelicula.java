package com.prueba.peliculas.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pelicula")
public class pelicula {
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	private String titulo;
	private String imagen;
	private String duracion;
	private int calificacion;
	private String trailer;
	private Date estreno;
	private String descripcion;
	
	public pelicula(){
		
	}	
	public pelicula(int id, String titulo, String imagen, String duracion,
			int calificacion, String trailer, Date estreno, String descripcion) {
		this.id = id;
		this.titulo = titulo;
		this.imagen = imagen;
		this.duracion = duracion;
		this.calificacion = calificacion;
		this.trailer = trailer;
		this.estreno = estreno;
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public String getTrailer() {
		return trailer;
	}
	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	public Date getEstreno() {
		return estreno;
	}
	public void setEstreno(Date estreno) {
		this.estreno = estreno;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
}
