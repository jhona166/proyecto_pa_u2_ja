package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.Random;

import com.example.demo.modelo.Vehiculo;

public class VehiculoRepositoryImpl implements VehiculoRepository {

	@Override
	public void insertarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Insertar vehiculo: "+v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el vehiculo con placa: "+placa);
		Vehiculo v = new Vehiculo();
		Random r = new Random();
		v.setMarca("Chervolet");
		v.setPlaca(placa);
		v.setPrecio(new BigDecimal(r.nextInt(2500)));
		String []tipos = {"L","P"};
		v.setTipo(tipos[r.nextInt(2)]);
		return v;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el vehiculo: "+v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el vehicula con placa: "+placa);
	}

}
