package com.tuuniversidad.repositoy;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tuuniversidad.Libro;
@Repository 
public class LibroRepositoryImp implements LibroRepository {
	private List<Libro>libros = new ArrayList<>();
	
	
	public LibroRepositoryImp() {
		libros.add(new Libro(978-270-800L,"METODOLODIA DE LA PROGRAMACION","CARELIA GUADALUPE","PLAZA Y VALDES","2008"));
		libros.add(new Libro(978-843-6954-302L,"PROGRAMACION WEB EN JAVA","JOSE MIGUEL ORDAX","EDUCACION.ES","2013"));
		libros.add(new Libro(978-844-8173-937L,"METODOLODIA DE LA PROGRAMACION","CARELIA GUADALUPE","PLAZA Y VALDES","2008"));	
	}

	public Libro getLibro(Long id) {
		for(Libro libro: libros) {
			if(id==libro.getId())
				return libro;
		}
		return null;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	@Override
	public Libro nuevoLibro(Libro libro) {
		libros.add(libro);
		return libro;
	}

}
