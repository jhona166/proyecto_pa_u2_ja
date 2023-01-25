package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2JaApplication implements CommandLineRunner {
	@Autowired
	private IHotelService iHotelService;
	@Autowired
	private IHabitacionService iHabitacionService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Habitacion> habitacionlist= new ArrayList<>();
		
		Hotel hotel=new Hotel();
		hotel.setNombre("Quito");
		hotel.setDireccion("Colon y Amazonas");
		
		Habitacion habitacion=new Habitacion();
		habitacion.setNumero("12");
		habitacion.setHotel(hotel);
		habitacionlist.add(habitacion);
		
		Habitacion habitacion1=new Habitacion();
		habitacion1.setNumero("24");
		habitacion1.setHotel(hotel);
		habitacionlist.add(habitacion1);
		
		Habitacion habitacion2=new Habitacion();
		habitacion2.setNumero("36");
		habitacion2.setHotel(hotel);
		habitacionlist.add(habitacion2);
		
		
		
		hotel.setHabitaciones(habitacionlist);

		//this.iHotelService.crear(hotel);
		
		//BUSQUEDA Y ACTUALIZACION
		
		Hotel hotel2=this.iHotelService.buscar(4);
		Habitacion habitacion4=new Habitacion();
		habitacion4.setNumero("96");
		habitacion4.setHotel(hotel2);
		habitacionlist.add(habitacion4);
		

		
		//BORRAR
		//this.iHabitacionService.eliminar(7);
		
		//Busco - consulto Nombre - Imprimo Habitaciones
		System.out.println(hotel2.getNombre());		
		
		for (Habitacion bh : habitacionlist) {
			System.out.println(bh.getNumero());
		}
	
		
	}

}
