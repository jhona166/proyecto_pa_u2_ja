package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.modelo.Transferencia;

public interface ICuentaBancariaService {
	public CuentaBancaria buscarPorNumero(String numeroCuenta);
	
	//Crud
	public CuentaBancaria buscar(Integer id);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void insertar(CuentaBancaria cuentaBancaria);
	public void borrar(Integer id);
	public List<CuentaBancaria> buscarReporte();
}
