package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Socio;

public interface ISocioService {
	public void crear(Socio socio);

	public void actualizar(Socio socio);

	public Socio buscar(Integer id);

	public void borrar(Integer id);
}
