package com.ecodeup.appmedicos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="antecedentes")
public class Antecedente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String personales;
	private String familiares;
	private String alergicos;
	private String medicamentos;
	private String habitos;
	@OneToOne
	private HistoriaClinica historiaClinica;
	public Antecedente() {
	
	}	
	public Antecedente(Integer id, String personales, String familiares, String alergicos, String medicamentos,
			String habitos, HistoriaClinica historiaClinica) {
		super();
		this.id = id;
		this.personales = personales;
		this.familiares = familiares;
		this.alergicos = alergicos;
		this.medicamentos = medicamentos;
		this.habitos = habitos;
		this.historiaClinica = historiaClinica;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPersonales() {
		return personales;
	}
	public void setPersonales(String personales) {
		this.personales = personales;
	}
	public String getFamiliares() {
		return familiares;
	}
	public void setFamiliares(String familiares) {
		this.familiares = familiares;
	}
	public String getAlergicos() {
		return alergicos;
	}
	public void setAlergicos(String alergicos) {
		this.alergicos = alergicos;
	}
	public String getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}
	public String getHabitos() {
		return habitos;
	}
	public void setHabitos(String habitos) {
		this.habitos = habitos;
	}
	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}
	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

	@Override
	public String toString() {
		return "Antecedente [id=" + id + ", personales=" + personales + ", familiares=" + familiares + ", alergicos="
				+ alergicos + ", medicamentos=" + medicamentos + ", habitos=" + habitos + ", historiaClinica="
				+ historiaClinica + "]";
	}	
}
