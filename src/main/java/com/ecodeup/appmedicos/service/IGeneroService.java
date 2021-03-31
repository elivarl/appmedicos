package com.ecodeup.appmedicos.service;

import com.ecodeup.appmedicos.entity.Genero;

public interface IGeneroService {
	Genero findByCodigo(String codigo);
	Genero save(Genero genero);
}
