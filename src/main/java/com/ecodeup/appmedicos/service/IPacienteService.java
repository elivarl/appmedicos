package com.ecodeup.appmedicos.service;

import java.util.List;
import java.util.Optional;

import com.ecodeup.appmedicos.entity.Paciente;

public interface IPacienteService {
	Paciente save (Paciente paciente);
	Optional<Paciente> findById(Integer id);
	List<Paciente> findAll();
	void deleteById (Integer id);
}
