package com.ecodeup.appmedicos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecodeup.appmedicos.entity.Genero;
import com.ecodeup.appmedicos.entity.Paciente;
import com.ecodeup.appmedicos.entity.TipoSangre;
import com.ecodeup.appmedicos.service.IGeneroService;
import com.ecodeup.appmedicos.service.IPacienteService;
import com.ecodeup.appmedicos.service.ITipoSangreService;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
	private Logger logger= LoggerFactory.getLogger(PacienteController.class);
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private ITipoSangreService tipoSangreService;
	
	@Autowired
	private IGeneroService generoService;
	
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("pacientes", pacienteService.findAll());
		return "paciente/index";
	}
	
	@GetMapping("/nuevo")
	public String nuevo() {
		return "paciente/create";
	}
	
	@PostMapping("/save")
	public String save (Paciente paciente, @RequestParam String tipo, @RequestParam String genero) {
		TipoSangre tipoSangre=tipoSangreService.findByCodigo(tipo);
		Genero generoObject= generoService.findByCodigo(genero);
		
		logger.info("Información del tipo {}", tipo);
		logger.info("Objeto tipo {}",  tipoSangre);
		logger.info("Informacion del genero: {}", genero);
		
		paciente.setTipoSangre(tipoSangre);
		paciente.setGenero(generoObject);
		logger.info("Información del paciente {}", paciente);
		pacienteService.save(paciente);
		return "redirect:/paciente/index";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable Integer id) {
		Paciente paciente= pacienteService.findById(id).get(); 
		
		logger.info("Id del paciente, {}", id);
		logger.info("Datos pacinete: {}",pacienteService.findById(id).get() );
		model.addAttribute("paciente", paciente);
		return "paciente/edit";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		pacienteService.deleteById(id);
		return "redirect:/paciente/index";
	}
	
}
