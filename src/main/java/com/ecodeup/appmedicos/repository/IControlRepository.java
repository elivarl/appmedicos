package com.ecodeup.appmedicos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecodeup.appmedicos.entity.ConsultaMedica;
import com.ecodeup.appmedicos.entity.Control;

@Repository
public interface IControlRepository extends JpaRepository<Control, Integer>{
	List<Control> findByConsulta(ConsultaMedica consulta);
}
