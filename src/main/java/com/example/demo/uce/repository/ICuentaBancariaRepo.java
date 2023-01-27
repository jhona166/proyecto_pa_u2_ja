package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Banco;
import com.example.demo.uce.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {
	public void insertar(CuentaBancaria cuentaBancaria);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public CuentaBancaria buscar(Integer id);
	public CuentaBancaria buscarLigero(Integer id);
	public void eliminar(Integer id);
}
