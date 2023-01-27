package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Banco;
import com.example.demo.uce.repository.IBancoRepo;

@Service
public class BancoServiceImpl implements IBancoService {
	@Autowired
	private IBancoRepo iBancoRepo;
	@Override
	public void crear(Banco banco) {
		// TODO Auto-generated method stub
		this.iBancoRepo.insertar(banco);
	}

	@Override
	public void actualizar(Banco banco) {
		// TODO Auto-generated method stub
		this.iBancoRepo.actualizar(banco);
	}

	@Override
	public Banco buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iBancoRepo.buscar(id);
	}

	@Override
	public Banco buscarLigero(Integer id) {
		// TODO Auto-generated method stub
		return this.iBancoRepo.buscarLigero(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iBancoRepo.eliminar(id);
	}
	
}
