package com.example.demo.repository;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Propietario;

public interface IPropietarioRepository {
	public void insertar(Propietario propietario);
	public Propietario buscar(String cedula);
	//CRUD
	public void actualizar(Propietario p);
	public void eliminar(String cedula);
}
