package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.modelo.Transferencia;

public interface ITranferenciaRepository {
		
	public Transferencia buscar(Integer id);
	public List<Transferencia> buscarTodos();
	//Crud
	public void actualizar(Transferencia transferencia);
	public void insertar(Transferencia transferencia);
	public void borrar(Integer id);
	
}
