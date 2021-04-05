package com.ecodeup.appmedicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.appmedicos.entity.ConsultaMedica;
import com.ecodeup.appmedicos.entity.Control;
import com.ecodeup.appmedicos.repository.IControlRepository;

@Service
public class ControlServiceImpl implements IControlService{
	
	@Autowired
	private IControlRepository controlRepository;

	@Override
	public List<Control> findByConsulta(ConsultaMedica consulta) {
		return controlRepository.findByConsulta(consulta);
	}

	@Override
	public Control save(Control control) {
		return controlRepository.save(control);
	}

	@Override
	public void deleteById(Integer id) {
		controlRepository.deleteById(id);
	}

}
