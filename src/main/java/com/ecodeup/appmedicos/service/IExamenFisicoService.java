package com.ecodeup.appmedicos.service;

import com.ecodeup.appmedicos.entity.ConsultaMedica;
import com.ecodeup.appmedicos.entity.ExamenFisico;

public interface IExamenFisicoService {
	ExamenFisico  findByConsultaMedica(ConsultaMedica consultaMedica);
	ExamenFisico save(ExamenFisico examenFisico);
	void deleteById(Integer id);
}
