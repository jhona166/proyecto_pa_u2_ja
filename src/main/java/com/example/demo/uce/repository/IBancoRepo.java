package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Banco;

public interface IBancoRepo {
		public void insertar(Banco banco);
		public void actualizar(Banco banco);
		public Banco buscar(Integer id);
		public Banco buscarLigero(Integer id);
		public void eliminar(Integer id);
}
