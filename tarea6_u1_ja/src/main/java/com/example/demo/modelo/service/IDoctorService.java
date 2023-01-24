package com.example.demo.modelo.service;

import com.example.demo.modelo.Doctor;

public interface IDoctorService {
	public void guardar(Doctor doctor);

	public void eliminar(String cedula);
}
