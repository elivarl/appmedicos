package com.ecodeup.appmedicos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.appmedicos.entity.ConsultaMedica;
import com.ecodeup.appmedicos.entity.ExamenFisico;
import com.ecodeup.appmedicos.repository.IExamenFisicoRepository;

@Service
public class ExamenFisicoServiceImpl implements IExamenFisicoService{
	
	@Autowired
	private IExamenFisicoRepository examenFisicoRepository;

	@Override
	public ExamenFisico findByConsultaMedica(ConsultaMedica consultaMedica) {
		return examenFisicoRepository.findByConsultaMedica(consultaMedica);
	}

	@Override
	public ExamenFisico save(ExamenFisico examenFisico) {
		return examenFisicoRepository.save(examenFisico);
	}

	@Override
	public void deleteById(Integer id) {
		examenFisicoRepository.deleteById(id);		
	}

}
