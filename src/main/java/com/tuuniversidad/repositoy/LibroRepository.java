package com.tuuniversidad.repositoy;

import java.util.List;

import com.tuuniversidad.Libro;

public interface LibroRepository {
	
	Libro getLibro(Long id);
	List<Libro> getLibros();
	Libro nuevoLibro(Libro libro);

}
