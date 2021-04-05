package com.ecodeup.appmedicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.appmedicos.entity.HistoriaClinica;
import com.ecodeup.appmedicos.entity.Paciente;
import com.ecodeup.appmedicos.repository.IHistoriaClinicaRepository;

@Service
public class HistoriaClinicaServiceImpl implements IHistoriaClinicaService{
	
	@Autowired
	private IHistoriaClinicaRepository historiaClinicaRepository;

	@Override
	public List<HistoriaClinica> findAll() {
		return historiaClinicaRepository.findAll();
	}

	@Override
	public HistoriaClinica findByPaciente(Paciente paciente) {
		return historiaClinicaRepository.findByPaciente(paciente);
	}

	@Override
	public HistoriaClinica save(HistoriaClinica historiaClinica) {
		return historiaClinicaRepository.save(historiaClinica);
	}

	@Override
	public void deleteById(Integer id) {
		historiaClinicaRepository.deleteById(id);		
	}

}
