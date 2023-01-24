package com.example.demo.modelo.service;

import java.time.LocalDateTime;

import javax.xml.crypto.Data;

public interface ICitaMedicaService {
	public void agendar(String cedulaD,String cedulaP,LocalDateTime fecha);
}
