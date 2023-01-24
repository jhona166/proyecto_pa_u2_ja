package com.example.demo.repository;

import com.example.demo.modelo.Matricula;

public interface IMatriculaRepository {

	public Matricula buscar(Matricula matricula);
	//CRUD
	public void insertar(Matricula matricula);
	public void actualizar(Matricula matricula);
	public void eliminar(String cedula);

}
