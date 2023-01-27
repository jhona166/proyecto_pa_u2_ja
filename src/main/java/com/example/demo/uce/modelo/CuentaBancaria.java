package com.example.demo.uce.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cuenta_bancaria")
public class CuentaBancaria {
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="cuenta_bancaria_sec")
	@SequenceGenerator(name="cuenta_bancaria_sec",sequenceName ="cuenta_bancaria_sec",allocationSize = 1)
	@Column(name="cban_id")
	private Integer id;
	@Column(name="cban_numero")
	private String numero;
	@Column(name="cban_fecha")
	private LocalDateTime fecha;
	
	@ManyToOne()
	@JoinColumn(name="cban_id_banco")
	private Banco banco;
	
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
	
	
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
}
