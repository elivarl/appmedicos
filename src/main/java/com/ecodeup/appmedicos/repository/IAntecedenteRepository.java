package com.ecodeup.appmedicos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecodeup.appmedicos.entity.Antecedente;
import com.ecodeup.appmedicos.entity.HistoriaClinica;

@Repository
public interface IAntecedenteRepository extends JpaRepository<Antecedente, Integer>{
	Optional<Antecedente> findByHistoriaClinica(HistoriaClinica historiaClinica);
}
