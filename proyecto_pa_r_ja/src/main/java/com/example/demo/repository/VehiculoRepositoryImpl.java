package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {
	public static List<Vehiculo> baseDeDatos = new ArrayList<>();
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado un vehiculo: "+vehiculo);
		baseDeDatos.add(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se busca vehiculo con placa: "+placa);
		Vehiculo vehi = null;
		vehi.setMarca("Mazda");
		vehi.setModelo("CX-5");
		vehi.setTipo(placa);
		vehi.setPrecio(new BigDecimal(2500));
		vehi.setTipo("L");
		return vehi;
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el vehiculo: "+vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el vehiculo con placa: "+placa);
	}

}
