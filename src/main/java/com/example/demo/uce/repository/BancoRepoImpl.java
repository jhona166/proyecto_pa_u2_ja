package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Banco;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class BancoRepoImpl implements IBancoRepo {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Banco banco) {
		// TODO Auto-generated method stub
		this.entityManager.persist(banco);
	}

	@Override
	public void actualizar(Banco banco) {
		// TODO Auto-generated method stub
		this.entityManager.merge(banco);
	}

	@Override
	public Banco buscar(Integer id) {
		// TODO Auto-generated method stub
		Banco banc = this.entityManager.find(Banco.class, id);
		banc.getCuentaBancaria().size();
		return  banc;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Banco banc =this.buscar(id);
		this.entityManager.remove(banc);
	}

	@Override
	public Banco buscarLigero(Integer id) {
		// TODO Auto-generated method stub
		Banco banc = this.entityManager.find(Banco.class, id);
		return banc;
	}

}
