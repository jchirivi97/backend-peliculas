package com.prueba.peliculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prueba.peliculas.model.usuario;

public interface usuarioRepository extends JpaRepository<usuario,Integer> {
	
	@Query(value="select u.nickname, u.nombre, u.nickname from usuario u where u.nickname = :nickname",nativeQuery = true)
	usuario getUser(String nickname);
}
