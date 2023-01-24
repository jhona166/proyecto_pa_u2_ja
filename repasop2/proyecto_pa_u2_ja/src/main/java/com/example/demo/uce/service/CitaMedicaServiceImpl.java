package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.CitaMedica;
import com.example.demo.uce.repository.ICitaMedicaRepo;
@Service

public class CitaMedicaServiceImpl implements ICitaMedicaService{
	@Autowired
	private ICitaMedicaRepo iCitaMedicaRepo;	
	@Override
	public void insertar(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.iCitaMedicaRepo.insertar(cita);
	}

	@Override
	public void actualizar(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.iCitaMedicaRepo.actualizar(cita);
	}

	@Override
	public CitaMedica buscar(String numeroCita) {
		// TODO Auto-generated method stub
		return this.iCitaMedicaRepo.buscar(numeroCita);
	}

}
