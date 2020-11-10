package com.prueba.peliculas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.peliculas.model.usuario;
import com.prueba.peliculas.repository.usuarioRepository;
import com.prueba.peliculas.service.usuarioService;

@Service
public class usuarioServiceImpl implements usuarioService {
	
	@Autowired
	usuarioRepository usuarioRep;
	
	@Override
	public usuario login(usuario user) throws Exception {
		usuario usuario = getUser(user.getNickname());
		try{
			if(usuario.equals(user)){
				return usuario;
			}else{
				throw new Exception("No existe el usuario");
			}
		}catch(Exception ex){
			throw new Exception("No existe el usuario");
		}
	}

	@Override
	public void saveUser(usuario user) {
		usuarioRep.save(user);		
	}

	@Override
	public usuario getUser(String nickname) {
		return usuarioRep.getUser(nickname);
	}


}
