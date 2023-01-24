package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	
	
	public CuentaBancaria buscarPorNumero(String numeroCuenta);
	public CuentaBancaria buscar(Integer id);
	//CRUD
	
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void insertar(CuentaBancaria cuentaBancaria);
	public void borrar(Integer id);
	public List<CuentaBancaria> buscarTodos();
}
