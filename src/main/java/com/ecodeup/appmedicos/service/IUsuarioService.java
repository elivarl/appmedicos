package com.ecodeup.appmedicos.service;

import java.util.List;

import com.ecodeup.appmedicos.entity.Usuario;

public interface IUsuarioService {
	List<Usuario> findAll();
	Usuario findById(Integer id);
	Usuario save(Usuario usuario); 
	void deleteById(Integer id);
}
