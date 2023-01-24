package com.example.demo.repository;

import com.example.demo.modelo.Propietario;

public interface IPropietarioRepository {

	public Propietario consultar(String cedula);
	//CRUD
	public void insertar(Propietario propietario);
	public void actualizar(Propietario propietatio);
	public void eliminar(String cedula);
	
	
}
