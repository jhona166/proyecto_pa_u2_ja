package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.service.ICiudadanoService;

@SpringBootApplication
public class RepasoPrueba3JaApplication implements CommandLineRunner {
	@Autowired
	private ICiudadanoService iCiudadanoService;

	//@Autowired
	//private IEmpleadoService iEmpleadoService;
	public static void main(String[] args) {
		SpringApplication.run(RepasoPrueba3JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
//		Ciudadano ciud = new Ciudadano();
//		ciud.setNombre("Jhonatan");
//		ciud.setApellido("Altamirano");
//		//ciud.setId(2);
//		
//	Empleado empl = new Empleado();
//	//empl.setId(1);
//	empl.setSalario(new BigDecimal(500));
//	empl.setFechaIngreso(LocalDateTime.now());
//
//	ciud.setEmpleado(empl);
//
//	Empleado empl1 = new Empleado();
//	//empl.setId(1);
//	empl1.setSalario(new BigDecimal(600));
//	empl1.setFechaIngreso(LocalDateTime.now());
//
//	ciud.setEmpleado(empl1);
//
//	
//	
//	iCiudadanoService.crear(ciud);
//
		
		
	}

}
