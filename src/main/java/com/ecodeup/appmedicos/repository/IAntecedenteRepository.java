package com.ecodeup.appmedicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecodeup.appmedicos.entity.Antecedente;
import com.ecodeup.appmedicos.entity.HistoriaClinica;

@Repository
public interface IAntecedenteRepository extends JpaRepository<Antecedente, Integer>{
	Antecedente findByHistoriaClinica(HistoriaClinica historiaClinica);
}
