package com.example.demo.uce.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="tarjeta_credito")
public class TarjetaCredito {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="tarjeta_credito_sec")
	@SequenceGenerator(name="tarjeta_credito_sec",sequenceName ="tarjeta_credito_sec",allocationSize = 1 )
	@Column(name="tarj_id")
	private Integer id;
	@Column(name="tarj_numero")
	private String numero;
	@Column(name="tarj_fecha_caducidad")
	private LocalDateTime fechaCaducidad;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tarj_id_socio")
	private Socio socio;
	
	
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
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
	public LocalDateTime getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
}
