package com.ecodeup.appmedicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecodeup.appmedicos.entity.TipoSangre;

@Repository
public interface ITipoSangreRepository extends JpaRepository<TipoSangre, Integer> {
	TipoSangre findByCodigo(String codigo);
}
