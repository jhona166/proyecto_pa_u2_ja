package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.CitaMedica;
import com.example.demo.modelo.Doctor;
import com.example.demo.modelo.Paciente;
import com.example.demo.modelo.service.ICitaMedicaService;
import com.example.demo.modelo.service.IDoctorService;
import com.example.demo.modelo.service.IPacienteService;

@SpringBootApplication
public class Tarea6U1JaApplication implements CommandLineRunner {

	@Autowired
	private ICitaMedicaService iCitaMedicaService;
	
	@Autowired
	private IDoctorService iDoctorService;
	
	@Autowired
	private IPacienteService iPacienteService;
	public static void main(String[] args) {
		SpringApplication.run(Tarea6U1JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Doctor doc=new Doctor();
		doc.setNombre("Francisco");;
		doc.setApellido("Salazar");
		doc.setCedula("1727501511");
		this.iDoctorService.guardar(doc);;
		
		Paciente pac = new Paciente();
		pac.setNombre("Jhonatan");;
		pac.setApellido("Altamirano");
		pac.setCedula("1727501510");		
		pac.setTipo("te");
		
		this.iPacienteService.guardar(pac);;
		
		CitaMedica cita = new CitaMedica();
		//cita.setFechaCita(LocalDateTime.now());
		this.iCitaMedicaService.agendar("1727501511", "172750150",LocalDateTime.now() );
		
		
	}

}
