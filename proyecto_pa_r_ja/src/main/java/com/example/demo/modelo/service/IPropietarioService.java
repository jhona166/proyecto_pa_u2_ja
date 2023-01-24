package com.example.demo.modelo.service;

import com.example.demo.modelo.Propietario;

public interface IPropietarioService {
	public void registrarPropietario(Propietario p);
	public void eliminar(String cedula);
	
}
