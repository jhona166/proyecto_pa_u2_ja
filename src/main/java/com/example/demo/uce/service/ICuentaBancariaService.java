package com.example.demo.uce.service;

import com.example.demo.uce.modelo.CuentaBancaria;
import com.example.demo.uce.modelo.Empleado;

public interface ICuentaBancariaService {
	public void ingresar(CuentaBancaria cuenta);
	public void actualizar(CuentaBancaria cuenta);
	public CuentaBancaria encontrar(Integer id);
	public void borrar(Integer id);

}
