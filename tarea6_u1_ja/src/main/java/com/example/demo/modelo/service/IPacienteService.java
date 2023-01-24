package com.example.demo.modelo.service;

import com.example.demo.modelo.Paciente;

public interface IPacienteService {
	public void guardar(Paciente paciente);

	public void eliminar(String cedula);
}
