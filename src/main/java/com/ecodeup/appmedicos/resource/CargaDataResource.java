package com.ecodeup.appmedicos.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecodeup.appmedicos.entity.Genero;
import com.ecodeup.appmedicos.entity.TipoSangre;
import com.ecodeup.appmedicos.service.IGeneroService;
import com.ecodeup.appmedicos.service.ITipoSangreService;


@RestController
@RequestMapping("cargas")
public class CargaDataResource {
	
	@Autowired
	private ITipoSangreService tipoSangreService;
	
	@Autowired
	private IGeneroService generoService;
	
	@GetMapping("/tiposangre")
	public void cargarTipoSangre() {		
		TipoSangre ts1= new TipoSangre(null, "O-", "O negativo");
		TipoSangre ts2= new TipoSangre(null, "O+", "O positivo");
		TipoSangre ts3= new TipoSangre(null, "A-", "A negativo");
		TipoSangre ts4= new TipoSangre(null, "A+", "A positivo");
		TipoSangre ts5= new TipoSangre(null, "B-", "B negativo");
		TipoSangre ts6= new TipoSangre(null, "B+", "B positivo");
		TipoSangre ts7= new TipoSangre(null, "AB-", "AB negativo");
		TipoSangre ts8= new TipoSangre(null, "AB+", "AB positivo");
		
		List<TipoSangre> tipos= new ArrayList<TipoSangre>();
		tipos.add(ts1);
		tipos.add(ts2);
		tipos.add(ts3);
		tipos.add(ts4);
		tipos.add(ts5);
		tipos.add(ts6);
		tipos.add(ts7);
		tipos.add(ts8);	
		
		tipoSangreService.savAll(tipos);			
	}
	
	@GetMapping("/genero")
	public void cargarGenero() {
		generoService.save(new Genero(null, "0", "Femenino"));
		generoService.save(new Genero(null, "1", "Masculino"));
	}
}
