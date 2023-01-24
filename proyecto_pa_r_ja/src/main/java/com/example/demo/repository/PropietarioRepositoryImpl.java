package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {
	public static List<Propietario> baseDeDatos = new ArrayList<>();
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el propietario: "+propietario);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		Propietario prop= null;
		prop.setNombre("Grace");
		prop.setApellido("Analuisa");
		prop.setCedula("1727501511");
		
		return null;
	}

	@Override
	public void actualizar(Propietario p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		
	}

}
