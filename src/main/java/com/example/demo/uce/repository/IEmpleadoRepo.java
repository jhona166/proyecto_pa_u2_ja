package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;

public interface IEmpleadoRepo {
	public void insertar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public Empleado buscar(Integer id);
	public void borrar(Integer id);
}
