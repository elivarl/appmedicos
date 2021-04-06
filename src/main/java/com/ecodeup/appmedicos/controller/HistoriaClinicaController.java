package com.ecodeup.appmedicos.controller;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecodeup.appmedicos.entity.HistoriaClinica;
import com.ecodeup.appmedicos.entity.Paciente;
import com.ecodeup.appmedicos.service.IHistoriaClinicaService;
import com.ecodeup.appmedicos.service.IPacienteService;


@Controller
@RequestMapping("/historia")
public class HistoriaClinicaController {
	private Logger logger = LoggerFactory.getLogger(HistoriaClinica.class);
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IHistoriaClinicaService historiaService;
	
	@GetMapping("/paciente")
	public String paciente (Model model) {
		model.addAttribute("pacientes", pacienteService.findAll());
		return "historias/index";
	}
	
	@GetMapping("/{idpaciente}")
	public String index(Model model, @PathVariable Integer idpaciente) {
		Paciente paciente=pacienteService.findById(idpaciente).get();
		HistoriaClinica historia=new HistoriaClinica();
		historia = historiaService.findByPaciente(paciente);
		 logger.info("Historia: {}",historia);
		
		//si la historia no existe
		if (historia==null) {
			historia= new HistoriaClinica(null, LocalDate.now(), historiaService.generarNumeroHistoria(), paciente, "");
			historiaService.save(historia);
			model.addAttribute("historia", historia);
		}
		model.addAttribute("historia", historia);
		model.addAttribute("paciente", paciente);
		
		return "historias/historia";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable Integer id) {
		HistoriaClinica historia=historiaService.findById(id).get();
		model.addAttribute("historia", historia);
		return "historias/edit";
	}
	
	@PostMapping("/save")
	public String save (HistoriaClinica historiaClinica) {
		HistoriaClinica historiaBase= historiaService.findById(historiaClinica.getId()).get();
		historiaBase.setComentarios(historiaClinica.getComentarios());
		logger.info("save: {}",historiaBase);
		historiaService.save(historiaBase);
		return "redirect:/historia/paciente";
	}

}
