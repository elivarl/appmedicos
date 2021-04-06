package com.ecodeup.appmedicos.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="historias_clinicas")
public class HistoriaClinica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate fechaRegistro;
	private String numero;
	@ManyToOne
	private Paciente paciente;	
	private String comentarios;
	
	public HistoriaClinica() {
		this.numero = null;
	
	}
	public HistoriaClinica(Integer id, LocalDate fechaRegistro, String numero, Paciente paciente, String comentarios) {
		super();
		this.id = id;
		this.fechaRegistro = fechaRegistro;
		this.numero = numero;
		this.paciente = paciente;
		this.comentarios = comentarios;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	@Override
	public String toString() {
		return "HistoriaClinica [id=" + id + ", fechaRegistro=" + fechaRegistro + ", numero=" + numero + ", paciente="
				+ paciente + ", comentarios=" + comentarios + "]";
	}
	
}
