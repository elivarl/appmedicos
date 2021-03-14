package com.ecodeup.appmedicos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="consultas")
public class ConsultaMedica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String motivo;
	private String enfermedadActual;
	private String diagnostico;
	private String registroOrden;
	private String prescripcion;
	@ManyToOne
	HistoriaClinica historiaClinica;
	
	public ConsultaMedica() {
	}
	public ConsultaMedica(Integer id, String motivo, String enfermedadActual, String diagnostico, String registroOrden,
			String prescripcion, HistoriaClinica historiaClinica) {
		super();
		this.id = id;
		this.motivo = motivo;
		this.enfermedadActual = enfermedadActual;
		this.diagnostico = diagnostico;
		this.registroOrden = registroOrden;
		this.prescripcion = prescripcion;
		this.historiaClinica = historiaClinica;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getEnfermedadActual() {
		return enfermedadActual;
	}
	public void setEnfermedadActual(String enfermedadActual) {
		this.enfermedadActual = enfermedadActual;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getRegistroOrden() {
		return registroOrden;
	}
	public void setRegistroOrden(String registroOrden) {
		this.registroOrden = registroOrden;
	}
	public String getPrescripcion() {
		return prescripcion;
	}
	public void setPrescripcion(String prescripcion) {
		this.prescripcion = prescripcion;
	}
	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}
	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}
	@Override
	public String toString() {
		return "ConsultaMedica [id=" + id + ", motivo=" + motivo + ", enfermedadActual=" + enfermedadActual
				+ ", diagnostico=" + diagnostico + ", registroOrden=" + registroOrden + ", prescripcion=" + prescripcion
				+ ", historiaClinica=" + historiaClinica + "]";
	}
}
