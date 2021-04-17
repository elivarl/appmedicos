package com.ecodeup.appmedicos.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecodeup.appmedicos.entity.Antecedente;
import com.ecodeup.appmedicos.entity.HistoriaClinica;
import com.ecodeup.appmedicos.service.IAntecedenteService;
import com.ecodeup.appmedicos.service.IHistoriaClinicaService;

@Controller
@RequestMapping("/historia/antecedentes")
public class AntecedenteController {
	@Autowired
	private IAntecedenteService antecedentesService;
	
	@Autowired
	private IHistoriaClinicaService historiaClinicaService;
	
	Logger loggAntecedente= LoggerFactory.getLogger(AntecedenteController.class);
	
	@GetMapping("/index/{idHistoria}")
	public String index(Model model, @PathVariable Integer idHistoria) {
		Antecedente ant= new Antecedente();
		Optional<HistoriaClinica> optionalHistoria= historiaClinicaService.findById(idHistoria);
		Optional<Antecedente> antOptional= antecedentesService.findByHistoriaClinica(optionalHistoria.get());
		if (antOptional.isPresent()) {
			ant=antOptional.get();
		}
		model.addAttribute("antecedente", ant);
		loggAntecedente.info("Antecedente: {}",ant);
		return "antecedentes/index";
	}
}
