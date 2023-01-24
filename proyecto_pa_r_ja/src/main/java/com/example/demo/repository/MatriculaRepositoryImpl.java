package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Matricula;
@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {
	public static List<Matricula> baseDeDatos = new ArrayList<>();
	
	@Override
	public void insertarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado la matricula: "+m);
		this.baseDeDatos.add(m);
	}

	@Override
	public Matricula buscar(String fechaMatricula) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la matricula: "+fechaMatricula);
		return null;
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la matricula");
	}

	@Override
	public void eliminar(String fechaMatricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la matricula: "+fechaMatricula);
		this.baseDeDatos.remove(fechaMatricula);
		
	}
	

}
