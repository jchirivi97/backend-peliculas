package com.prueba.peliculas.service;

import com.prueba.peliculas.model.usuario;

public interface usuarioService {
	
	usuario login(usuario user) throws Exception;
	void saveUser(usuario user);
	usuario getUser(String nickname);
}
