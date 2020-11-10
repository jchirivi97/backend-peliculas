package com.prueba.peliculas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.peliculas.model.categoria;
import com.prueba.peliculas.repository.categoriaRepository;
import com.prueba.peliculas.service.categoriaService;

@Service
public class categoriaServiceImpl implements categoriaService{
	
	@Autowired
	categoriaRepository categoriaRep;

	@Override
	public void saveCategory(categoria category) {
		categoriaRep.save(category);
	}

	@Override
	public List<categoria> allCategorys() {
		return categoriaRep.findAll();
	}
}
