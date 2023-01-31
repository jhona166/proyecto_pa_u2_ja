package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.service.ILibroService;

@SpringBootApplication
public class ProyectoPaU2JaApplication implements CommandLineRunner {
	@Autowired
	private ILibroService iLibroService;
//	@Autowired
//	private IHabitacionService iHabitacionService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		List<Habitacion> habitacionlist= new ArrayList<>();
//		
//		Hotel hotel=new Hotel();
//		hotel.setNombre("Quito");
//		hotel.setDireccion("Colon y Amazonas");
//		
//		Habitacion habitacion=new Habitacion();
//		habitacion.setNumero("12");
//		habitacion.setHotel(hotel);
//		habitacionlist.add(habitacion);
//		
//		Habitacion habitacion1=new Habitacion();
//		habitacion1.setNumero("24");
//		habitacion1.setHotel(hotel);
//		habitacionlist.add(habitacion1);
//		
//		Habitacion habitacion2=new Habitacion();
//		habitacion2.setNumero("36");
//		habitacion2.setHotel(hotel);
//		habitacionlist.add(habitacion2);
//		
//		
//		
//		hotel.setHabitaciones(habitacionlist);
//
//		//this.iHotelService.crear(hotel);
//		
//		//BUSQUEDA Y ACTUALIZACION
//		
//		Hotel hotel2=this.iHotelService.buscar(4);
//		Habitacion habitacion4=new Habitacion();
//		habitacion4.setNumero("96");
//		habitacion4.setHotel(hotel2);
//		habitacionlist.add(habitacion4);
//		
//
//		
//		//BORRAR
//		//this.iHabitacionService.eliminar(7);
//		
//		//Busco - consulto Nombre - Imprimo Habitaciones
//		System.out.println(hotel2.getNombre());		
//		
//		for (Habitacion bh : habitacionlist) {
//			System.out.println(bh.getNumero());
//		}
//	
//		Set<Libro> libros = new HashSet<Libro>();
//		Libro libro1=new Libro();
//		libro1.setNombre("Analisis N");
//		Libro libro2=new Libro();
//		libro2.setNombre("Matematica E");
//		Libro libro3=new Libro();
//		libro3.setNombre("Fisica A");
//		
//		libros.add(libro1);
//		libros.add(libro2);
//		libros.add(libro3);
//		Autor autor=new Autor();
//		autor.setNombre("A");
//		autor.setNombre("B");
//		autor.setNombre("C");
//		
//		
//		this.iLibroService.crear(libro1);
//
//		this.iLibroService.crear(libro2);
//
//		this.iLibroService.crear(libro3);

		Libro libro = new Libro();
		libro.setNombre("Analisis Numerico");
		
		Autor autor1 = new Autor();
		autor1.setNombre("O");
		
		Autor autor2 = new Autor();
		autor2.setNombre("D");
		
		Autor autor3 = new Autor();
		autor3.setNombre("J");
		
		Set<Autor> autores = new HashSet<>();
		autores.add(autor1);
		autores.add(autor2);
		autores.add(autor3);
		libro.setAutores(autores);
		
		this.iLibroService.crear(libro);
	}
	

}
