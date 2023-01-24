package com.example.demo.modelo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CitaMedica;
import com.example.demo.modelo.Doctor;
import com.example.demo.modelo.Paciente;
import com.example.demo.modelo.repository.ICitaMedicaRepository;
import com.example.demo.modelo.repository.IDoctorRepository;
import com.example.demo.modelo.repository.IPacienteRepository;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	private IDoctorRepository iDoctorRepository;
	@Autowired
	private IPacienteRepository iPacienteRepository;
	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;
	
	@Override
	public void agendar(String cedulaD, String cedulaP, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		CitaMedica cita =new CitaMedica();
		cita.setFechaCita(LocalDateTime.now());
		Doctor pro=this.iDoctorRepository.buscar(cedulaD);
		cita.setDoctor(pro);
		
		Paciente paciente=this.iPacienteRepository.buscar(cedulaP);
		cita.setPaciente(paciente);
		
		BigDecimal valor=null;
		if(paciente.getTipo().equals("te")) {
			valor=cita.getCosto().multiply(new BigDecimal(0.15));
		}else {
			valor=cita.getCosto().multiply(new BigDecimal(0.10));

		}
		//-1 valor izquierda menor
		//0 iguales
		//1 valor derecha es menor
		if(valor.compareTo(new BigDecimal(2000))>1) {
			BigDecimal descuento=valor.multiply(new BigDecimal(0.07));
			valor=valor.subtract(descuento);
		}
		cita.setCosto(valor);
		this.iCitaMedicaRepository.crear(cita);;
		
	}

}
