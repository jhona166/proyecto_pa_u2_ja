package com.example.demo.modelo.repository;

import com.example.demo.modelo.Paciente;

public interface IPacienteRepository {
	public void insertar(Paciente paciente);
	public void eliminar(String cedula);
	public Paciente buscar(String cedula);
}
