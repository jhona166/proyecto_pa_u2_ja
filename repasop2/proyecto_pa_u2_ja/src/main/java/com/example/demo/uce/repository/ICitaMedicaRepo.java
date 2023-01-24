package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.CitaMedica;

public interface ICitaMedicaRepo {
	public void insertar(CitaMedica cita);

	public void actualizar(CitaMedica cita);
	public CitaMedica buscar(String cita);
}
