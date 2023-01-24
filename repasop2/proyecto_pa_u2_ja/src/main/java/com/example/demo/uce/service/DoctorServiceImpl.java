package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Doctor;
import com.example.demo.uce.repository.IDoctorRepo;
@Service

public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepo iDoctorRepo;
	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.iDoctorRepo.insertar(doctor);
	}

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iDoctorRepo.buscar(id);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.iDoctorRepo.actualizar(doctor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iDoctorRepo.eliminar(id);
	}

}
