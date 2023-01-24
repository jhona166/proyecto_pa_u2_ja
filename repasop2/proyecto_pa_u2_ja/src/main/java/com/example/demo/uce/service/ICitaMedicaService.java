package com.example.demo.uce.service;

import com.example.demo.uce.modelo.CitaMedica;

public interface ICitaMedicaService {
	public void insertar(CitaMedica cita);

	public void actualizar(CitaMedica cita);

	public CitaMedica buscar(String numeroCita);

}
