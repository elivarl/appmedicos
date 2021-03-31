package com.ecodeup.appmedicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.ecodeup.appmedicos.entity.Genero;

@Service
public interface IGeneroRepository extends JpaRepository<Genero, Integer> {
	Genero findByCodigo(String codigo);
}
