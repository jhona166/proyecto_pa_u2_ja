package com.example.demo.repository;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepo {
	//CRUD
	public Vehiculo buscar(String placa);
	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public void borrar(String placa);
}
