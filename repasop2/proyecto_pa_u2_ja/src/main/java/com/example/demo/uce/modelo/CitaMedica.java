package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cita_medica")

public class CitaMedica {
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cita_medica_seq")
	@SequenceGenerator(name="doctor_seq",sequenceName = "doctor_seq",allocationSize = 1)
	@Column(name="cita_id")
	private Integer id;
	@Column(name="cita_numero_cita")
	private String numero;
	@Column(name="cita_fecha_cita")
	private LocalDateTime fecha;
	@Column(name="cita_valor_cita")
	private BigDecimal valor;
	@Column(name="cita_lugar_cita")
	private String lugar;
	@Column(name="cita_diagnostico")
	private String diagnostico;
	@Column(name="cita_receta")
	private String receta;
	@Column(name="cita_fecha_proxima_cita")
	private LocalDateTime fechaProxima;
	
	
	
	//Set and Get 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getReceta() {
		return receta;
	}
	public void setReceta(String receta) {
		this.receta = receta;
	}
	public LocalDateTime getFechaProxima() {
		return fechaProxima;
	}
	public void setFechaProxima(LocalDateTime fechaProxima) {
		this.fechaProxima = fechaProxima;
	}
	
}
