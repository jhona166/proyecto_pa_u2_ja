package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;

public class VehiculoRepoImpl implements IVehiculoRepo{
	private static List<Vehiculo> baseDeDatos = new ArrayList<Vehiculo>();
	
	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo=null;
		for (Vehiculo v : baseDeDatos) {
			if(v.getPlaca().equals(placa)) {
				vehiculo = v;
			}
		}
		return vehiculo;
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		baseDeDatos.add(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Vehiculo vehi=null;
		for (Vehiculo v : baseDeDatos) {
			if(v.getPlaca().equals(vehiculo.getPlaca())) {
				vehi= v;
			}
		}
		baseDeDatos.remove(vehi);
		baseDeDatos.add(vehi);
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		baseDeDatos.remove(this.buscar(placa));
	}

}
