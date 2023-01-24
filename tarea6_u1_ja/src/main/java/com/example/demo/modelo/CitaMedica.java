package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CitaMedica {
	private LocalDateTime fechaCita;
	private Doctor doctor;
	private Paciente paciente;
	private BigDecimal costo;
	
	
	
	@Override
	public String toString() {
		return "CitaMedica [fechaCita=" + fechaCita + ", doctor=" + doctor + ", paciente=" + paciente + ", costo="
				+ costo + "]";
	}
	public BigDecimal getCosto() {
		return costo;
	}
	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	

}
