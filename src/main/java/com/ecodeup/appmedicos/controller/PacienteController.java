package com.ecodeup.appmedicos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecodeup.appmedicos.entity.Paciente;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
	private Logger logger= LoggerFactory.getLogger(PacienteController.class);
	
	
	@GetMapping("/index")
	public String index() {
		return "paciente/index";
	}
	
	@GetMapping("/nuevo")
	public String nuevo() {
		return "paciente/create";
	}
	
	@PostMapping("/save")
	public String save (Paciente paciente) {
		logger.info("Información del paciente {}", paciente);
		return "redirect:/paciente/index";
	}
	
}
