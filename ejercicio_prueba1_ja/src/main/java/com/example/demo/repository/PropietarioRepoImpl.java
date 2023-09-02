package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.modelo.Propietario;

public class PropietarioRepoImpl implements IPropietarioRepo{
	private static List<Propietario> baseDeDatos = new ArrayList<>();

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		baseDeDatos.add(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		baseDeDatos.remove(this.buscar(cedula));
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		Propietario prop = null;
		for (Propietario p : baseDeDatos) {
			if(p.getCedula().equals(cedula)) {
				prop=p;
			}
		}	
		return prop;
	}

	
	

}
