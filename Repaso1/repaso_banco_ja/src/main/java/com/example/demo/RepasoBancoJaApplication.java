package com.example.demo;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.modelo.Transferencia;
import com.example.demo.service.ICuentaBancariaService;
import com.example.demo.service.ITransferenciaService;

@SpringBootApplication
public class RepasoBancoJaApplication implements CommandLineRunner{
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoBancoJaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setNumero("001");
		cuenta1.setTipo("A");
		cuenta1.setTitular("Jhonatan Altamirano");
		cuenta1.setSaldo(new BigDecimal(300));
		this.bancariaService.insertar(cuenta1);
		
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumero("002");
		cuenta2.setTipo("A");
		cuenta2.setTitular("Danilo Ortiz");
		cuenta2.setSaldo(new BigDecimal(500));
		this.bancariaService.insertar(cuenta2);
		
		System.out.println("Saldos actuales");
		CuentaBancaria cuentaActual1 = this.bancariaService.buscarPorNumero("001");
		CuentaBancaria cuentaActual2 = this.bancariaService.buscarPorNumero("002");
		
		System.out.println("Saldo actual 1: "+cuentaActual1.getSaldo());
		System.out.println("Saldo actual 2: "+cuentaActual2.getSaldo());
		
		System.out.println("Reporte 1");
		for(Transferencia t : this.iTransferenciaService.buscarReporte()) {
			System.out.println(t);
		} 
		this.iTransferenciaService.realizar("001","002",new BigDecimal(100));
		System.out.println("Reporte 2");
		for(Transferencia t:this.iTransferenciaService.buscarReporte()) {
			System.out.println(t);
		}
		System.out.println("Saldos nuevos");
		CuentaBancaria cuentaConsultar1 = this.bancariaService.buscarPorNumero("001");
		CuentaBancaria cuentaConsultar2 = this.bancariaService.buscarPorNumero("002");
		
		System.out.println("Nuevo saldo: "+cuentaConsultar1.getSaldo());
		System.out.println("Nuevo saldo: "+cuentaConsultar2.getSaldo());
		
		
		
		
		System.out.println("Buscar Cuentas Bancarias");
		for(CuentaBancaria c:this.bancariaService.buscarReporte()) {
			System.out.println(c);
		}
	}

}
