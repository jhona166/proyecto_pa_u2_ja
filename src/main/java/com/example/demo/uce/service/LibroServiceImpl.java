package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.repository.LibroRepoImpl;
@Service
public class LibroServiceImpl implements ILibroService{
	@Autowired
	LibroRepoImpl libroRepoImpl;
	@Override
	public void crear(Libro libro) {
		// TODO Auto-generated method stub
		libroRepoImpl.insertar(libro);
	}

}
