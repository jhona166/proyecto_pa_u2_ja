package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU2JaApplication implements CommandLineRunner {
	@Autowired
	private IVehiculoService iVehiculoService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPlaca("PCO10");
		vehiculo.setModelo("Sentra");
		vehiculo.setValorDia(new BigDecimal(300));
		
		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.setPlaca("PCO11");
		vehiculo2.setModelo("Aveo");

		vehiculo.setValorDia(new BigDecimal(500));
		
		Set<Cliente> clientes = new HashSet<>();
		Set<Cliente> clientes2 = new HashSet<>();
		
		Cliente cliente = new Cliente();
		cliente.setCedula("1727501510");
		cliente.setNombre("Jhonatan");
		cliente.setApellido("Altamirano");
		
		Cliente cliente2 = new Cliente();
		cliente2.setCedula("1234567890");
		cliente2.setNombre("Danilo");
		cliente2.setApellido("Ortiz");
		
		
		Cliente cliente3 = new Cliente();
		cliente3.setCedula("1234567891");
		cliente3.setNombre("Grace");
		cliente3.setApellido("Analuiza");
	
		
		Cliente cliente4 = new Cliente();
		cliente4.setCedula("1234567892");
		cliente4.setNombre("Quiroz");
		
		
		clientes.add(cliente);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes2.add(cliente4);
		clientes2.add(cliente2);
		
		vehiculo.setClientes(clientes);	
		vehiculo2.setClientes(clientes2);
		this.iVehiculoService.crear(vehiculo);
		//this.iVehiculoService.crear(vehiculo2);
		// Buscar
		this.iVehiculoService.encontrar(1);
		
		// Actualizar
		Vehiculo vehiculo3 = this.iVehiculoService.encontrar(1);
		vehiculo3.setPlaca("PCO13");
		this.iVehiculoService.modificar(vehiculo3);
		
		// Eliminar
		//this.iVehiculoService.encontrar(2);
	}

}
