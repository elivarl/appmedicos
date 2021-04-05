package com.ecodeup.appmedicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecodeup.appmedicos.entity.ConsultaMedica;
import com.ecodeup.appmedicos.entity.ExamenFisico;

@Repository
public interface IExamenFisicoRepository extends JpaRepository<ExamenFisico, Integer> {
	ExamenFisico findByConsultaMedica(ConsultaMedica consultaMedica);
}
