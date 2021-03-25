package com.ecodeup.appmedicos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecodeup.appmedicos.entity.Paciente;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
	
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
		return "redirect:/index";
	}
	
}
