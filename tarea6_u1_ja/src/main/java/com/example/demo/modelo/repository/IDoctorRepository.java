package com.example.demo.modelo.repository;

import com.example.demo.modelo.Doctor;
import com.example.demo.modelo.Paciente;

public interface IDoctorRepository {
	public void insertar(Doctor doctor);
	public void eliminar(String cedula);
	public Doctor buscar(String cedula);
}
