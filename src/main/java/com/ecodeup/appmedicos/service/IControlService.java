package com.ecodeup.appmedicos.service;

import java.util.List;

import com.ecodeup.appmedicos.entity.ConsultaMedica;
import com.ecodeup.appmedicos.entity.Control;

public interface IControlService {
	List<Control> findByConsulta(ConsultaMedica consulta);
	Control save(Control control);
	void deleteById(Integer id);
}
