package com.example.demo.repository;

import com.example.demo.modelo.Vehiculo;

public interface VehiculoRepository {
	
	public void insertarVehiculo(Vehiculo v);
	public Vehiculo buscar(String placa);
	
	//CRUD
	
	public void actualizar(Vehiculo v);
	public void eliminar(String placa);

}
