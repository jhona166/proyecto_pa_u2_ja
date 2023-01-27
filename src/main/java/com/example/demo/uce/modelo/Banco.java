package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="banco")
public class Banco {
		@Id 
		@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="banco_sec")
		@SequenceGenerator(name="banco_sec",sequenceName ="banco_sec",allocationSize = 1)
		@Column(name="banc_id")
		private Integer id;
		@Column(name="banc_nombre")
		private String nombre;
		@Column(name="banc_direccion")
		private String direccion;
		
		@OneToMany(mappedBy="banco",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
		private List<CuentaBancaria> cuentaBancaria;
		
		
		//Set and Get 
		
		public List<CuentaBancaria> getCuentaBancaria() {
			return cuentaBancaria;
		}
		public void setCuentaBancaria(List<CuentaBancaria> cuentaBancaria) {
			this.cuentaBancaria = cuentaBancaria;
		}
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
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
}
