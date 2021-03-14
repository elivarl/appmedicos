package com.ecodeup.appmedicos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="examenes_fisicos")
public class ExamenFisico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	// signos vitales
	private double talla;
	private double peso;
	private double frecuenciaCardiaca;
	private double indiceMasaCorporal;
	private int pulsoDerecho;
	private int pulsoIzquierdo;
	//organos y sistemas
	private String sentido;
	private String respiratorio;
	private String cardiovascular;
	private String nervioso;
	private String genital;
	private String digestivo;
	private String urinario;
	private String mesqueletico;
	private String endocrino;
	private String linfatico;
	private String comentarios;
	@OneToOne
	private ConsultaMedica consultaMedica;
	
	public ExamenFisico() {
	
	}
	
	public ExamenFisico(Integer id, double talla, double peso, double frecuenciaCardiaca, double indiceMasaCorporal,
			int pulsoDerecho, int pulsoIzquierdo, String sentido, String respiratorio, String cardiovascular,
			String nervioso, String genital, String digestivo, String urinario, String mesqueletico, String endocrino,
			String linfatico, String comentarios, ConsultaMedica consultaMedica) {
		super();
		this.id = id;
		this.talla = talla;
		this.peso = peso;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.indiceMasaCorporal = indiceMasaCorporal;
		this.pulsoDerecho = pulsoDerecho;
		this.pulsoIzquierdo = pulsoIzquierdo;
		this.sentido = sentido;
		this.respiratorio = respiratorio;
		this.cardiovascular = cardiovascular;
		this.nervioso = nervioso;
		this.genital = genital;
		this.digestivo = digestivo;
		this.urinario = urinario;
		this.mesqueletico = mesqueletico;
		this.endocrino = endocrino;
		this.linfatico = linfatico;
		this.comentarios = comentarios;
		this.consultaMedica = consultaMedica;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getTalla() {
		return talla;
	}
	public void setTalla(double talla) {
		this.talla = talla;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}
	public void setFrecuenciaCardiaca(double frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}
	public double getIndiceMasaCorporal() {
		return indiceMasaCorporal;
	}
	public void setIndiceMasaCorporal(double indiceMasaCorporal) {
		this.indiceMasaCorporal = indiceMasaCorporal;
	}
	public int getPulsoDerecho() {
		return pulsoDerecho;
	}
	public void setPulsoDerecho(int pulsoDerecho) {
		this.pulsoDerecho = pulsoDerecho;
	}
	public int getPulsoIzquierdo() {
		return pulsoIzquierdo;
	}
	public void setPulsoIzquierdo(int pulsoIzquierdo) {
		this.pulsoIzquierdo = pulsoIzquierdo;
	}
	public String getSentido() {
		return sentido;
	}
	public void setSentido(String sentido) {
		this.sentido = sentido;
	}
	public String getRespiratorio() {
		return respiratorio;
	}
	public void setRespiratorio(String respiratorio) {
		this.respiratorio = respiratorio;
	}
	public String getCardiovascular() {
		return cardiovascular;
	}
	public void setCardiovascular(String cardiovascular) {
		this.cardiovascular = cardiovascular;
	}
	public String getNervioso() {
		return nervioso;
	}
	public void setNervioso(String nervioso) {
		this.nervioso = nervioso;
	}
	public String getGenital() {
		return genital;
	}
	public void setGenital(String genital) {
		this.genital = genital;
	}
	public String getDigestivo() {
		return digestivo;
	}
	public void setDigestivo(String digestivo) {
		this.digestivo = digestivo;
	}
	public String getUrinario() {
		return urinario;
	}
	public void setUrinario(String urinario) {
		this.urinario = urinario;
	}
	public String getMesqueletico() {
		return mesqueletico;
	}
	public void setMesqueletico(String mesqueletico) {
		this.mesqueletico = mesqueletico;
	}
	public String getEndocrino() {
		return endocrino;
	}
	public void setEndocrino(String endocrino) {
		this.endocrino = endocrino;
	}
	public String getLinfatico() {
		return linfatico;
	}
	public void setLinfatico(String linfatico) {
		this.linfatico = linfatico;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public ConsultaMedica getConsultaMedica() {
		return consultaMedica;
	}

	public void setConsultaMedica(ConsultaMedica consultaMedica) {
		this.consultaMedica = consultaMedica;
	}

	@Override
	public String toString() {
		return "ExamenFisico [id=" + id + ", talla=" + talla + ", peso=" + peso + ", frecuenciaCardiaca="
				+ frecuenciaCardiaca + ", indiceMasaCorporal=" + indiceMasaCorporal + ", pulsoDerecho=" + pulsoDerecho
				+ ", pulsoIzquierdo=" + pulsoIzquierdo + ", sentido=" + sentido + ", respiratorio=" + respiratorio
				+ ", cardiovascular=" + cardiovascular + ", nervioso=" + nervioso + ", genital=" + genital
				+ ", digestivo=" + digestivo + ", urinario=" + urinario + ", mesqueletico=" + mesqueletico
				+ ", endocrino=" + endocrino + ", linfatico=" + linfatico + ", comentarios=" + comentarios
				+ ", consultaMedica=" + consultaMedica + "]";
	}
}
