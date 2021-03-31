package com.ecodeup.appmedicos.service;

import java.util.List;

import com.ecodeup.appmedicos.entity.TipoSangre;

public interface ITipoSangreService {
	void savAll(List<TipoSangre> tipos);
	TipoSangre save(TipoSangre tipoSangre);
	TipoSangre findByCodigo(String codigo);
}
