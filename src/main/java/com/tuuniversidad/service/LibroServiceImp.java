package com.tuuniversidad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuuniversidad.Libro;
import com.tuuniversidad.repositoy.LibroRepository;


@Service
public class LibroServiceImp  implements LibroService{
	
	@Autowired
	private LibroRepository libroRepository;
		
	

	@Override
	public Libro getLibro(Long id) {
		return libroRepository.getLibro(id);
	}

	@Override
	public List<Libro> getLibros() {
		return libroRepository.getLibros();
	}

	@Override
	public Libro nuevoLibro(Libro libro) {
		return libroRepository.nuevoLibro(libro);
	}
	

}
