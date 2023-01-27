package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Banco;

public interface IBancoService {
	public void crear(Banco banco);
	public void actualizar(Banco banco);
	public Banco buscar(Integer id);
	public Banco buscarLigero(Integer id);
	public void borrar(Integer id);
}
