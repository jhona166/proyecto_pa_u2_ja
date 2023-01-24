package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Doctor;
import com.example.demo.uce.modelo.Paciente;
import com.example.demo.uce.service.IDoctorService;
import com.example.demo.uce.service.IGestorCitaService;
import com.example.demo.uce.service.IPacienteService;

@SpringBootApplication
public class ProyectoPaU2JaApplication implements CommandLineRunner{
	@Autowired
	private IPacienteService iPacienteService;

	@Autowired
	private IDoctorService iDoctorService;

	@Autowired
	private IGestorCitaService iGestorCitaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*
		Doctor doctor = new Doctor();
		doctor.setCedula("2300290992");
		doctor.setNombre("Michael");
		doctor.setApellido("Garcia");
		doctor.setFechaNacimiento(LocalDateTime.now());
		doctor.setNumeroConsultorio("15");
		doctor.setCodigoSenescyt("2154125");
		doctor.setGenero("Masculino");

		this.iDoctorService.insertar(doctor);

		Doctor doctor1 = new Doctor();
		doctor1.setCedula("1234");
		doctor1.setNombre("Milena");
		doctor1.setApellido("Sandoval");
		doctor1.setFechaNacimiento(LocalDateTime.now());
		doctor1.setNumeroConsultorio("28");
		doctor.setCodigoSenescyt("12512");
		doctor.setGenero("Femenino");

		this.iDoctorService.insertar(doctor1);

		Paciente paciente = new Paciente();
		paciente.setCedula("987");
		paciente.setNombre("Luis");
		paciente.setApellido("Suarez");
		
		paciente.setGenero("Masculino");

		this.iPacienteService.insertar(paciente);

		Paciente paciente1 = new Paciente();
		paciente1.setCedula("532");
		paciente1.setNombre("Maria");
		paciente1.setApellido("Rodriguez");
		
		paciente1.setGenero("Femenino");

		this.iPacienteService.insertar(paciente1);
		*/
		this.iGestorCitaService.agendar("528",LocalDateTime.of(1996, 12, 2, 8, 56),new BigDecimal(300),  "Desca");
	}

}
