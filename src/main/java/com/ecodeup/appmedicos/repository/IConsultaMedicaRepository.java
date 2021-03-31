package com.ecodeup.appmedicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.ecodeup.appmedicos.entity.ConsultaMedica;
import com.ecodeup.appmedicos.entity.HistoriaClinica;

@Service
public interface IConsultaMedicaRepository extends JpaRepository<ConsultaMedica, Integer> {
	ConsultaMedica findByHistoriaClinica(HistoriaClinica historiaClinica);
}
