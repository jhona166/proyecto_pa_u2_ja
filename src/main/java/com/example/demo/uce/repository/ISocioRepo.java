package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.modelo.Socio;

public interface ISocioRepo {
	public void insertar(Socio socio);

	public void actualizar(Socio socio);

	public Socio buscar(Integer id);

	public void eliminar(Integer id);
}
