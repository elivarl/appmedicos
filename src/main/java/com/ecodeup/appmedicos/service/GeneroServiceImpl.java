package com.ecodeup.appmedicos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.appmedicos.entity.Genero;
import com.ecodeup.appmedicos.repository.IGeneroRepository;

@Service
public class GeneroServiceImpl implements IGeneroService{
	
	@Autowired
	private IGeneroRepository generoRepository;

	@Override
	public Genero save(Genero genero) {
		// TODO Auto-generated method stub
		return generoRepository.save(genero);
	}

	@Override
	public Genero findByCodigo(String codigo) {
		return generoRepository.findByCodigo(codigo);
	}

}
