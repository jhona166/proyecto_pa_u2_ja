package com.example.demo.modelo.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Doctor;

@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {
	private static List<Doctor> base=new ArrayList<>();
	

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		base.remove(cedula);
	}

	@Override
	public Doctor buscar(String cedula) {
		// TODO Auto-generated method stub
		Doctor doc=null;
		for(Doctor p: base) {
			if(p.getCedula().equals(cedula)) {
				doc=p;
			}
		}
		return doc;
	}

	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		System.out.println("Se ha ingresado "+doctor);
		base.add(doctor);
	}



}
