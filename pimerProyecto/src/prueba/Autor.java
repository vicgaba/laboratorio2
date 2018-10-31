/* a la representacion de autor agregar fecha de nacimiento definiendo la clase fecha 
 * como la composicion de dia mes y año como enteros, 
 * validandolos de que sean válidos
 * Definir un constructor para la fecha, definir interpretal la fecha a partir de un string con 
 * formato "dd/mm/aaaa"
 * Definir equals para fechas.
 * Retomar la definicion de la clase matriz para objetos, que en la fila y columna pueda ir cualquier cosa.
 */

package prueba;

public class Autor {

	private String nombre;
	private String apellido;
	private String nacionalidad;
	private Libro libro;
	
	public Autor(String nombre, String apellido) {
		this.setNombre(nombre);
		this.setApellido(apellido);
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {  //revisar esto
		this.libro = libro;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null) throw new RuntimeException("El nombre no puede estar vacío");
		this.nombre = nombre.toUpperCase();
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		if (apellido == null) throw new RuntimeException("El apellido no puede estar vacío");
		this.apellido = apellido.toUpperCase();
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
}
