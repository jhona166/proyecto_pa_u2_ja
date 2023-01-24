package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Doctor;

public interface IDoctorService {
	public void insertar(Doctor doctor);
	public Doctor buscar(Integer id);
	public void actualizar(Doctor doctor);
	public void eliminar(Integer id);
}
