package com.example.demo.modelo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.CitaMedica;

@Repository
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository {
	private static List<CitaMedica> base=new ArrayList<>();
	@Override
	public void crear(CitaMedica cita) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado la cita"+cita);
		base.add(cita);
		
	}

}
