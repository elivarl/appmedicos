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

import com.ecodeup.appmedicos.entity.Paciente;
import com.ecodeup.appmedicos.service.IPacienteService;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
	private Logger logger= LoggerFactory.getLogger(PacienteController.class);
	
	@Autowired
	private IPacienteService pacienteService;
	
	
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
	public String save (Paciente paciente) {
		logger.info("Información del paciente {}", paciente);
		pacienteService.save(paciente);
		return "redirect:/paciente/index";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable Integer id) {
		logger.info("Id del paciente, {}", id);
		logger.info("Datos pacinete: {}",pacienteService.findById(id).get() );
		model.addAttribute("paciente", pacienteService.findById(id).get());
		return "paciente/edit";
	}
	
}
