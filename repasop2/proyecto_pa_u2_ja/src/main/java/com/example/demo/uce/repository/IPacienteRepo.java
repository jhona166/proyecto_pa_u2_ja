package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Paciente;

public interface IPacienteRepo {
	public void insertar(Paciente paciente);
	public Paciente buscar(Integer id);
	public void actualizar(Paciente paciente);
	public void eliminar(Integer id);
}
