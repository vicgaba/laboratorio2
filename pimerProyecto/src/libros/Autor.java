//poder crear un autor con varios libros

package libros;

import java.util.LinkedList;

import java.util.List;

public class Autor extends Persona{
	private String nacionalidad;
	private List<Libro>libros = new LinkedList<Libro>();

	public Autor(int id, String nombre) {
		super(id, nombre);
	}
	public void agregar(Libro libro) {
		if (libro == null) throw new RuntimeException("El parámetro libro no puede ser nulo");
		libros.add(libro);
		libro.setAutor(this);
	}
	public Iterable<Libro> libros() { return this.libros; }
	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

/*	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
		this.libro.setAutor(this);
	}*/
}
