package com.ecodeup.appmedicos.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="controles")
public class Control {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate fecha;
	private String comentarios;
	@ManyToOne
	private ConsultaMedica consulta;
	public Control() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public ConsultaMedica getConsulta() {
		return consulta;
	}
	public void setConsulta(ConsultaMedica consulta) {
		this.consulta = consulta;
	}
	@Override
	public String toString() {
		return "Control [id=" + id + ", fecha=" + fecha + ", comentarios=" + comentarios + ", consulta=" + consulta
				+ "]";
	}
}
