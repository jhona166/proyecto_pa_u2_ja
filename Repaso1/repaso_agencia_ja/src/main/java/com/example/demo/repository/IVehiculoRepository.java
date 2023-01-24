package com.example.demo.repository;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepository {

	
	public Vehiculo buscar(String placa);
	//CRUD
	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public void eliminar(String placa);

}
