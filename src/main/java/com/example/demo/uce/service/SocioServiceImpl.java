package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Socio;
import com.example.demo.uce.repository.ISocioRepo;

@Service
public class SocioServiceImpl implements ISocioService{
	@Autowired
	private ISocioRepo iSocioRepo; 
	@Override
	public void crear(Socio socio) {
		// TODO Auto-generated method stub
		this.iSocioRepo.insertar(socio);
	}

	@Override
	public void actualizar(Socio socio) {
		// TODO Auto-generated method stub
		this.iSocioRepo.actualizar(socio);
	}

	@Override
	public Socio buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iSocioRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iSocioRepo.eliminar(id);
	}

}
