package com.example.demo.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorCitaService {
	public void agendar(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita);

	public void actualizarPorNumeroCita(String numeroCita, String Diagnostico, String receta,
			LocalDateTime fechaProximaCita);
}
