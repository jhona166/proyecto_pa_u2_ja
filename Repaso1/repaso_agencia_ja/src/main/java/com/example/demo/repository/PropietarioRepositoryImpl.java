package com.example.demo.repository;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository	 {

	
	
	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Propietario propie = new Propietario();
		propie.setNombre("Jhonatan");
		propie.setApellido("Altamirano");
		propie.setCedula(cedula);

		return propie;
	}

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el propietario:"+propietario);
	}

	@Override
	public void actualizar(Propietario propietatio) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el propietario:" +propietatio);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el propietario con cedula: "+cedula );
	}

}
