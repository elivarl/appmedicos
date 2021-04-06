package com.ecodeup.appmedicos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.appmedicos.entity.HistoriaClinica;
import com.ecodeup.appmedicos.entity.Paciente;
import com.ecodeup.appmedicos.repository.IHistoriaClinicaRepository;

@Service
public class HistoriaClinicaServiceImpl implements IHistoriaClinicaService {

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

	@Override
	public Optional<HistoriaClinica> findById(Integer id) {
		return historiaClinicaRepository.findById(id);
	}

	// 0000010
	public String generarNumeroHistoria() {
		int numero = 0;
		String numeroConcatenado = "";

		List<HistoriaClinica> historias = findAll();

		List<Integer> numeros = new ArrayList<Integer>();

		historias.stream().forEach(o -> numeros.add(Integer.parseInt(o.getNumero())));

		if (historias.isEmpty()) {
			numero = 1;
		} else {
			numero = numeros.stream().max(Integer::compare).get();
			numero++;
		}

		if (numero < 10) { // 0000001000
			numeroConcatenado = "000000000" + String.valueOf(numero);
		} else if (numero < 100) {
			numeroConcatenado = "00000000" + String.valueOf(numero);
		} else if (numero < 1000) {
			numeroConcatenado = "0000000" + String.valueOf(numero);
		} else if (numero < 10000) {
			numeroConcatenado = "0000000" + String.valueOf(numero);
		}

		return numeroConcatenado;
	}

}
