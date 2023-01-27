package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Socio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class SocioRepoImpl implements ISocioRepo{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Socio socio) {
		// TODO Auto-generated method stub
		this.entityManager.persist(socio);
	}

	@Override
	public void actualizar(Socio socio) {
		// TODO Auto-generated method stub
		this.entityManager.merge(socio);
	}

	@Override
	public Socio buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Socio.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(id);
	}

}
