package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="vehiculo")

//Principal
public class Vehiculo {
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="vehiculo_sec")
		@SequenceGenerator(name="vehiculo_sec",sequenceName = "vehiculo_sec",allocationSize = 1)
		@Column(name="vehi_id")
		private Integer id; 
		@Column(name="vehi_placa")
		private String placa;
		@Column(name="vehi_modelo")
		private String modelo;
		@Column(name="vehi_valor_dia")
		private BigDecimal valorDia;
		
		
		@ManyToMany(cascade = CascadeType.ALL)
		@JoinTable(
				name = "renta",//Nombre de la tabla de rompimmiento
				joinColumns = @JoinColumn(name="veci_id_vehiculo"),
				inverseJoinColumns = @JoinColumn(name="vecl_id_cliente")
				)
		private Set<Cliente> clientes;
		
		//Set and Get
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public BigDecimal getValorDia() {
			return valorDia;
		}
		public void setValorDia(BigDecimal valorDia) {
			this.valorDia = valorDia;
		}
		
		public Set<Cliente> getClientes() {
			return clientes;
		}
		public void setClientes(Set<Cliente> clientes) {
			this.clientes = clientes;
		}
		
		
		
		
		
		
		
}
