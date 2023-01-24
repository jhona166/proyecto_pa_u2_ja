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
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2JaApplication implements CommandLineRunner {
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
				//CIUDADANO
				Ciudadano ciuda=new Ciudadano();
				ciuda.setNombre("Jhonatan ");
				ciuda.setApellido("Altamirano");

				//EMPLEADO
				Empleado emple=new Empleado();
				emple.setSalario(new BigDecimal(475));
				emple.setFechaIngreso(LocalDateTime.now());
				emple.setCiudadano(ciuda);
				
				//INGRESAR
				//this.ciudadanoService.ingresar(ciuda);
				//this.empleadoService.ingresar(emple);
				
				Empleado emple1=this.empleadoService.encontrar(1);
				emple1.setSalario(new BigDecimal(900));
				
				this.empleadoService.actualizar(emple1);
				
				Ciudadano ciuda1 =this.ciudadanoService.encontrar(1);
				ciuda1.setNombre("Juan");
				ciuda1.setEmpleado(emple1);
				ciuda1.setApellido("Arias");
				this.ciudadanoService.actualizar(ciuda1);
				
	}

}
