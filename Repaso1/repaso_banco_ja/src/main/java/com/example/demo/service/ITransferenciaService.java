package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.modelo.Transferencia;

public interface ITransferenciaService {
	public List<Transferencia> buscarReporte();
	public void realizar(String numeroOrigen,String numeroDestino,BigDecimal monto);
}
