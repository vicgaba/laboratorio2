//Investigar localDate, 

package libros;

import java.time.LocalDate;

public class Persona {
	private int id;
	private String nombre;
	private String nacionalidad;
	private LocalDate nacimiento;
	
	public Persona(int id, String nombre) {
		this.setId(id);
		this.setNombre(nombre);
		this.setNacimiento(LocalDate.now());
	}
	public int edad() {
		return LocalDate.now().getYear() - this.nacimiento.getYear();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public LocalDate getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}
	@Override
	public String toString() {
		return this.nombre + ". " + this.edad();
	}
}
