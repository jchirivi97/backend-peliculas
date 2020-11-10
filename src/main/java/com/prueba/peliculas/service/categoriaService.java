package com.prueba.peliculas.service;

import java.util.List;

import com.prueba.peliculas.model.categoria;

public interface categoriaService {

	void saveCategory(categoria category);
	List<categoria> allCategorys();
	
}
