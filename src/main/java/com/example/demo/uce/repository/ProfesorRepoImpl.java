package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;


import com.example.demo.uce.modelo.Profesor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class ProfesorRepoImpl implements IProfesorRepo {
	@PersistenceContext	
	private EntityManager entityManager;
	@Override
	public void insertar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(profesor);
	}

	@Override
	public void actualizar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(profesor);
		
	}

	
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Profesor prof = this.buscar(id);
		this.entityManager.remove(prof);
	}

	@Override
	public Profesor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Profesor.class,id);
	}

}
