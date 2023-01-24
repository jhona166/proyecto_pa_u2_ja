package com.example.demo.repository;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Vehiculo;

public interface IMatriculaRepository {
	public void insertarMatricula(Matricula m);
	public Matricula buscar(String fechaMatricula);
	//CRUD
	public void actualizar(Matricula m);
	public void eliminar(String fechaMatricula);
}
