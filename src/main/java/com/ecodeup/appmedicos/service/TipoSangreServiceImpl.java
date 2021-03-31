package com.ecodeup.appmedicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.appmedicos.entity.TipoSangre;
import com.ecodeup.appmedicos.repository.ITipoSangreRepository;

@Service
public class TipoSangreServiceImpl implements ITipoSangreService{
	
	@Autowired
	private ITipoSangreRepository tipoSangreRepository;

	@Override
	public TipoSangre save(TipoSangre tipoSangre) {
		return tipoSangreRepository.save(tipoSangre);
	}

	@Override
	public void savAll(List<TipoSangre> tipos) {
		tipoSangreRepository.saveAll(tipos);
	}

	@Override
	public TipoSangre findByCodigo(String codigo) {
		return tipoSangreRepository.findByCodigo(codigo);
	}
}
