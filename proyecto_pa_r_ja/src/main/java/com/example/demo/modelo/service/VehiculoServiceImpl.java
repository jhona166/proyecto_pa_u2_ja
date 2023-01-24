package com.example.demo.modelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService {
	@Autowired
	IVehiculoRepository iVehiculoRepository;
	@Override
	public void registrarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.insertar(v);
	}

	@Override
	public Vehiculo consultar(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.buscar(placa) ;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.actualizar(v);
	}

	@Override
	public void eliminar(String placa) {
○ c x
// TODO Auto-generated method stub
.
                  cxccccc                                                                      vfc                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
}
