package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2JaApplication implements CommandLineRunner{
	@Autowired
	private IEstudianteService estudianteService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estu = new Estudiante();
		Estudiante estu1 = new Estudiante();
		//estu.setId(9);
		estu.setNombre("Karol");
		estu.setApellido("Analuisa");
		estu.setCedula("1727501512");
		estu.setCuidad("Quito");
		estu.setGenero("F");
	
		this.estudianteService.agregar(estu);
		//estu.setCuidad("Guayaquil");
		//this.estudianteService.modificar(estu);
	}

}
