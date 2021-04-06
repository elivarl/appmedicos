package com.ecodeup.appmedicos.service;

import java.util.List;
import java.util.Optional;

import com.ecodeup.appmedicos.entity.HistoriaClinica;
import com.ecodeup.appmedicos.entity.Paciente;

public interface IHistoriaClinicaService {
	List<HistoriaClinica> findAll();
	HistoriaClinica findByPaciente(Paciente paciente);
	HistoriaClinica save (HistoriaClinica historiaClinica);
	void deleteById(Integer id);
	Optional<HistoriaClinica> findById(Integer id);
	public String generarNumeroHistoria();

}
