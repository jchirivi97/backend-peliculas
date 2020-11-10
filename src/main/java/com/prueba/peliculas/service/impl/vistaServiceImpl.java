package com.prueba.peliculas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.peliculas.model.vista;
import com.prueba.peliculas.repository.vistaRepository;
import com.prueba.peliculas.service.vistaService;

@Service
public class vistaServiceImpl implements vistaService {

	@Autowired
	vistaRepository vistaRep;
	
	@Override
	public void saveView(vista view) {
		vistaRep.save(view);
	}

	@Override
	public List<vista> allViews(int idUser) {
		return vistaRep.allVistas(idUser);
	}

}
