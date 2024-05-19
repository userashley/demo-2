package com.tuuniversidad;

public class Libro {
	private Long id;
	private String titulo;
	private String autor;
	private String editorial;
	private String anioPublicacion;
	
	

	public Libro(Long id, String titulo, String autor, String editorial, String anioPublicacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.anioPublicacion = anioPublicacion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(String anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	
	
	
	

}
