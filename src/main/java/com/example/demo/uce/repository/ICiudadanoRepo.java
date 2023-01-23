package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Ciudadano;

public interface ICiudadanoRepo {
	public void insertar(Ciudadano ciudadano);
	public void actualizar(Ciudadano cuidadano);
	public Ciudadano buscar(Integer id);
	public void borrar(Integer id);
	
	
}
