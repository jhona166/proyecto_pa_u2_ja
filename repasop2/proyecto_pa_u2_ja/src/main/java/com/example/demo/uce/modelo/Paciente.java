package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="paciente")
public class Paciente {
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "paciente_seq")
	@SequenceGenerator(name="paciente_seq",sequenceName = "paciente_seq",allocationSize = 1)
	@Column(name="paci_id")
	private Integer id;
	@Column(name="paci_cedula")
	private String cedula;
	@Column(name="paci_nombre")
	private String nombre;
	@Column(name="paci_apellido")
	private String apellido;
	@Column(name="paci_cod_seguro")
	private String codSeguro;
	@Column(name="paci_estatura")
	private String estatura;
	@Column(name="paci_peso")
	private String peso;
	@Column(name="paci_genero")
	private String genero;
	//Set and get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCodSeguro() {
		return codSeguro;
	}
	public void setCodSeguro(String codSeguro) {
		this.codSeguro = codSeguro;
	}
	public String getEstatura() {
		return estatura;
	}
	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
