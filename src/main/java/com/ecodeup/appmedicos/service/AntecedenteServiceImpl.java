package com.ecodeup.appmedicos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.appmedicos.entity.Antecedente;
import com.ecodeup.appmedicos.entity.HistoriaClinica;
import com.ecodeup.appmedicos.repository.IAntecedenteRepository;

@Service
public class AntecedenteServiceImpl implements IAntecedenteService{

	@Autowired
	private IAntecedenteRepository antecedentesRepository;
	@Override
	public List<Antecedente> findAll() {
		return null;
	}

	@Override
	public Optional<Antecedente> findByHistoriaClinica(HistoriaClinica historiaClinica) {
		return antecedentesRepository.findByHistoriaClinica(historiaClinica);
	}

	@Override
	public Antecedente save(Antecedente antecedente) {
		return antecedentesRepository.save(antecedente);
	}

	@Override
	public void deleteById(Integer id) {
		antecedentesRepository.deleteById(id);
	}

}
