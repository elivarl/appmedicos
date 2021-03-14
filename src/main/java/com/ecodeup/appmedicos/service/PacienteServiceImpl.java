package com.ecodeup.appmedicos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.appmedicos.entity.Paciente;
import com.ecodeup.appmedicos.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService {
	
	@Autowired
	private IPacienteRepository pacienteRepository;

	@Override
	public Paciente save(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}

	@Override
	public Optional<Paciente> findById(Integer id) {
		return pacienteRepository.findById(id);
	}

	@Override
	public List<Paciente> findAll() {
		return pacienteRepository.findAll();
	}

	@Override
	public void delete(Paciente paciente) {
		pacienteRepository.delete(paciente);
	}

}
