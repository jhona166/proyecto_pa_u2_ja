package com.example.demo.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.CitaMedica;
import com.example.demo.uce.repository.ICitaMedicaRepo;
import com.example.demo.uce.repository.IDoctorRepo;
import com.example.demo.uce.repository.IPacienteRepo;
@Service
public class GestorCitaServiceImpl implements IGestorCitaService{
	@Autowired
	private ICitaMedicaRepo iCitaMedicaRepository;

	@Autowired
	private IPacienteRepo iPacienteRepository;

	@Autowired
	private IDoctorRepo iDoctorRepository;

	@Override
	public void agendar(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita) {
		// TODO Auto-generated method stub
		CitaMedica cita = new CitaMedica();
		cita.setNumero(numeroCita);
		cita.setFecha(fechaCita);
		cita.setValor(valorCita);
		cita.setLugar(lugarCita);
		this.iCitaMedicaRepository.insertar(cita);
	}

	@Override
	public void actualizarPorNumeroCita(String numeroCita, String diagnostico, String receta,
			LocalDateTime fechaProximaCita) {
		// TODO Auto-generated method stub
		CitaMedica cita = this.iCitaMedicaRepository.buscar(numeroCita);
		cita.setDiagnostico(diagnostico);
		cita.setReceta(receta);
		cita.setFechaProxima(fechaProximaCita);

		this.iCitaMedicaRepository.actualizar(cita);

	}

	
}
