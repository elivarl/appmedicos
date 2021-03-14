package com.ecodeup.appmedicos.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pacientes")
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String identificacion;
	private String nombres;
	private String apellidos;
	private String ocupacion;
	private String estadoCivil;
	private String email;  
	private String tipoSangre;
	private String direccion;
	private String celular;
	private String genero;
	private LocalDate fechaNacimiento;
	
	public Paciente() {
	
	}	
	public Paciente(Integer id, String identificacion, String nombres, String apellidos, String ocupacion,
			String estadoCivil, String email, String tipoSangre, String direccion, String celular, String genero,
			LocalDate fechaNacimiento) {
		super();
		this.id = id;
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.ocupacion = ocupacion;
		this.estadoCivil = estadoCivil;
		this.email = email;
		this.tipoSangre = tipoSangre;
		this.direccion = direccion;
		this.celular = celular;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipoSangre() {
		return tipoSangre;
	}
	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Paciente [id=" + id + ", identificacion=" + identificacion + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", ocupacion=" + ocupacion + ", estadoCivil=" + estadoCivil + ", email=" + email
				+ ", tipoSangre=" + tipoSangre + ", direccion=" + direccion + ", celular=" + celular + ", genero="
				+ genero + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
}
