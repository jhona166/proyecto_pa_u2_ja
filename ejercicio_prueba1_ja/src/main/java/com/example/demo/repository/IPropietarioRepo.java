package com.example.demo.repository;

import com.example.demo.modelo.Propietario;

public interface IPropietarioRepo {
	public void insertar(Propietario propietario);
	public void eliminar(String cedula);
	public Propietario buscar(String cedula);
	
}
