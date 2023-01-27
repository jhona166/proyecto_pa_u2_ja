package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Banco;
import com.example.demo.uce.modelo.CuentaBancaria;
import com.example.demo.uce.service.IBancoService;
import com.example.demo.uce.service.ICuentaBancariaService;

@SpringBootApplication
public class ProyectoPaU2JaApplication implements CommandLineRunner {
	@Autowired
	IBancoService iBancoService;
	@Autowired
	ICuentaBancariaService iCuentaBancariaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Banco banco = new Banco();
		banco.setNombre("Pichincha");
		banco.setDireccion("Av Amazonas");

		Banco banco1 = new Banco();
		banco1.setNombre("Solidario");
		banco1.setDireccion("Av La Prensa");
		
		
		CuentaBancaria cuenta =new CuentaBancaria();
		cuenta.setNumero("123456789");
		cuenta.setFecha(LocalDateTime.now());
		cuenta.setBanco(banco);
	
		CuentaBancaria cuenta1 =new CuentaBancaria();
		cuenta.setNumero("123456780");
		cuenta.setFecha(LocalDateTime.now());
		cuenta.setBanco(banco1);
		
		CuentaBancaria cuenta2 =new CuentaBancaria();
		cuenta.setNumero("123456781");
		cuenta.setFecha(LocalDateTime.now());
		cuenta.setBanco(banco1);
		
		CuentaBancaria cuenta3 =new CuentaBancaria();
		cuenta.setNumero("123456782");
		cuenta.setFecha(LocalDateTime.now());
		cuenta.setBanco(banco1);
	//Creacion	
		this.iBancoService.crear(banco);
		this.iBancoService.crear(banco1);
		this.iCuentaBancariaService.ingresar(cuenta1);
		
		//Buscar
		//		Banco banco4 = this.iBancoService.buscar(2);
//		System.out.println(banco4.getNombre());
//	//Actualizar
//		banco4.setNombre("Guayaquil");
	//Eliminar
	//	iBancoService.borrar(2);
		//List<CuentaBancaria> cuentas = banco4.getCuentaBancaria();  
		
	}

}
