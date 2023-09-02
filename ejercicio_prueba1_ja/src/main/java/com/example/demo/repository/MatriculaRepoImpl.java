package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.modelo.Matricula;

public class MatriculaRepoImpl implements IMatriculaRepo{
	private static List<Matricula> baseDeDatos = new ArrayList<>();

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		baseDeDatos.add(matricula);

	}
	

	
}
