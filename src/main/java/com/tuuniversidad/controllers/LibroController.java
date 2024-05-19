package com.tuuniversidad.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tuuniversidad.Libro;
import com.tuuniversidad.service.LibroService;

@RestController
public class LibroController {
	
	@Autowired
	private LibroService libroService;
	

	
	@GetMapping("/hola")
	public String Hola() {
		return "Hola Spring Boot";
	}
	
	@PostMapping("/libros")
	public Libro nuevoLibro(@RequestBody Libro libro) {
		libroService.nuevoLibro(libro);
		return libro;
		
	}
	
	@GetMapping("/libros/{id}")
	public Libro getLibro(@PathVariable Long id) {
		Libro libro = libroService.getLibro(id);
		return libro;
	}
	
	@GetMapping("/libros")
	public List <Libro> getLibros(){
		return libroService.getLibros();
}
	


}