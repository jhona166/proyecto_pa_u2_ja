package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IProfesorService;

@SpringBootApplication
public class ProyectoPaU2JaApplication implements CommandLineRunner{
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IProfesorService profesorService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 Profesor prof = new Profesor();
		 
		 prof.setNombre("Pablo");
		 prof.setApellido("Zaldumbide");
		 prof.setCedula("1234567890");
		 prof.setDireccion("San Carlos");
		 prof.setGenero("M");
		 prof.setCuidad("Quito");
		 this.profesorService.agregar(prof);
		
		 //Estudiante estu = new Estudiante();
		//Estudiante estu1 = new Estudiante();
		//estu.setId(9);
		//estu.setNombre("Karol");
		//estu.setApellido("Analuisa");
		//estu.setCedula("1727501512");
		//estu.setCuidad("Quito");
		//estu.setGenero("M");
		//this.estudianteService.agregar(estu);
		//estu.setCuidad("Guayaquil");
		//this.estudianteService.modificar(estu);
	}

}
