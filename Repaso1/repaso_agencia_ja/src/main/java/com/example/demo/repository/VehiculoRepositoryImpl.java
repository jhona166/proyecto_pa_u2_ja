package com.example.demo.repository;
import java.math.BigDecimal;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el vehiculo con placa: "+placa);
		Vehiculo v = new Vehiculo();
		Random r = new Random();
		v.setMarca("Mazda");
		v.setPlaca(placa);
		v.setPrecio(new BigDecimal(r.nextInt(2500)));
		String [] tipos = {"L","P"};
		v.setTipo(tipos[r.nextInt(2)]);
		return v;
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el vehiculo: "+vehiculo);
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el vehiculo: "+vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el vehiculo: "+placa);
	}
	

}
