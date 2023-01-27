package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Socio;
import com.example.demo.uce.modelo.TarjetaCredito;
import com.example.demo.uce.service.ISocioService;



@SpringBootApplication
public class ProyectoPaU2JaApplication implements CommandLineRunner {
	@Autowired
	private ISocioService iSocioService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Socio socio = new Socio();
		socio.setNombre("Jhonatan");
		socio.setApellido("Altamirano");

		Socio socio1 = new Socio();
		socio1.setNombre("Grace");
		socio1.setApellido("Analuiza");
		
		Socio socio2 = new Socio();
		socio2.setNombre("Lenin");
		socio2.setApellido("Caroa");
		
		TarjetaCredito tarjeta = new TarjetaCredito();
		tarjeta.setNumero("123456789");
		tarjeta.setFechaCaducidad(LocalDateTime.now());
		tarjeta.setSocio(socio);
		
		this.iSocioService.crear(socio);
		
		//Buscar
//		Socio socio4 = this.iSocioService.buscar(1);
//		System.out.println(socio4.getNombre());
		
		//Actualizar
//		socio4.setNombre("Danilo");
//		this.iSocioService.actualizar(socio4);
		
		//Eliminar
//		this.iSocioService.borrar(1);
		
	}

}
