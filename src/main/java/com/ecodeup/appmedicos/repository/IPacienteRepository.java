package com.ecodeup.appmedicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecodeup.appmedicos.entity.Paciente;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Integer> {
}
