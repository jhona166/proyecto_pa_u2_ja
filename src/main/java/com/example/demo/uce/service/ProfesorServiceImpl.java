package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.repository.IEstudianteRepo;
import com.example.demo.uce.repository.IProfesorRepo;
@Service
public class ProfesorServiceImpl implements IProfesorService{
	@Autowired
	private IProfesorRepo iprofesorrepo;
	@Override
	public void agregar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.iprofesorrepo.insertar(profesor);
	}

	@Override
	public void modificar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.iprofesorrepo.actualizar(profesor);
	}

	@Override
	public Profesor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iprofesorrepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iprofesorrepo.eliminar(id);
	}

}
