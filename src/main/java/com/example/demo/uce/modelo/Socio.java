package com.example.demo.uce.modelo;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="socio")
public class Socio {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="socio_sec")
	@SequenceGenerator(name="socio_sec",sequenceName ="socio_sec",allocationSize = 1 )
	@Column(name="soci_id")
	private Integer id;
	@Column(name="soci_nombre")
	private String nombre;
	@Column(name="soci_apellido")
	private String apellido;
	
	@OneToOne(mappedBy = "socio",cascade = CascadeType.ALL)
	private TarjetaCredito tarjeta;
	
	
	public TarjetaCredito getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(TarjetaCredito tarjeta) {
		this.tarjeta = tarjeta;
	}
	//Set and Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	
	
}
