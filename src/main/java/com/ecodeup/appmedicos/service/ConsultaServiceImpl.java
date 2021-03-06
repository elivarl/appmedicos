package com.ecodeup.appmedicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.appmedicos.entity.ConsultaMedica;
import com.ecodeup.appmedicos.entity.HistoriaClinica;
import com.ecodeup.appmedicos.repository.IConsultaMedicaRepository;

@Service
public class ConsultaServiceImpl implements IConsultaMedicaService {

	@Autowired
	private IConsultaMedicaRepository consultaRepository;

	@Override
	public List<ConsultaMedica> findAll() {
		return consultaRepository.findAll();
	}

	@Override
	public ConsultaMedica save(ConsultaMedica consultaMedica) {
		return consultaRepository.save(consultaMedica);
	}

	@Override
	public ConsultaMedica fidByHistoriaClinica(HistoriaClinica historiaClinica) {
		return consultaRepository.findByHistoriaClinica(historiaClinica);
	}

	@Override
	public void delete(Integer id) {
		consultaRepository.deleteById(id);
	}

}
