package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.repository.ICiudadanoRepo;
@Service
public class CiudadanoServiceImpl implements ICiudadanoService{
	@Autowired
	ICiudadanoRepo iCiudadanoRepo;
	
	@Override
	public void crear(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
	this.iCiudadanoRepo.insertar(ciudadano);	
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
	this.iCiudadanoRepo.actualizar(ciudadano);
	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iCiudadanoRepo.eliminar(id);
	}
	
}
