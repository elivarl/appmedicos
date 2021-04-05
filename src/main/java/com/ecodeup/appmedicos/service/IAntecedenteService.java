package com.ecodeup.appmedicos.service;

import com.ecodeup.appmedicos.entity.Antecedente;
import com.ecodeup.appmedicos.entity.HistoriaClinica;

import java.util.List;

public interface IAntecedenteService {
	List<Antecedente> findAll();
	Antecedente findByHistoriaClinica(HistoriaClinica historiaClinica);
	Antecedente save(Antecedente antecedente);
	void deleteById(Integer id);
}
