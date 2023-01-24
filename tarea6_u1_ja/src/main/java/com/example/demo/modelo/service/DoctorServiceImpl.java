package com.example.demo.modelo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Doctor;
import com.example.demo.modelo.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepository iDoctorRepository;
	@Override
	public void guardar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.iDoctorRepository.insertar(doctor);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.iDoctorRepository.eliminar(cedula);
	}

}
