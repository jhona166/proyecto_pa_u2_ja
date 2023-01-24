package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Doctor;
import com.example.demo.uce.modelo.Paciente;

public interface IPacienteService {
	public void insertar(Paciente paciente);
	public Paciente buscar(Integer id);
	public void actualizar(Paciente paciente);
	public void eliminar(Integer id);
}
