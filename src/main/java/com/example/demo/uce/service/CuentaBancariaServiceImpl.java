package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.CuentaBancaria;
import com.example.demo.uce.repository.ICuentaBancariaRepo;
@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {
	@Autowired
	private ICuentaBancariaRepo iCuentaBancariaRepo;
	@Override
	public void ingresar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepo.insertar(cuenta);
	}

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepo.actualizar(cuenta);
	}

	@Override
	public CuentaBancaria encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.iCuentaBancariaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepo.eliminar(id);
	}

}
