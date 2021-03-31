package com.ecodeup.appmedicos.service;

import java.util.List;

import com.ecodeup.appmedicos.entity.ConsultaMedica;
import com.ecodeup.appmedicos.entity.HistoriaClinica;

public interface IConsultaMedicaService {
	List<ConsultaMedica> findAll();
	ConsultaMedica save(ConsultaMedica consultaMedica);
	ConsultaMedica fidByHistoriaClinica (HistoriaClinica historiaClinica);
	void delete(Integer id);

}
