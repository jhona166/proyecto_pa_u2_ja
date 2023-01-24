package com.example.demo.modelo.service;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {
	public void registrarVehiculo(Vehiculo v);

	public Vehiculo consultar(String placa);

	public void actualizar(Vehiculo v);

	public void eliminar(String placa);
}
