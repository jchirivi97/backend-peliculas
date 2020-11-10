package com.prueba.peliculas.service;

import java.util.List;

import com.prueba.peliculas.model.vista;

public interface vistaService  {
	
	void saveView(vista view);
	List<vista> allViews(int idUser);
}
