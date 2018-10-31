package Parcial1;

public class Alumno {
	private int legajo;
	private float altura;
	private Fecha nacimiento;
	private int edad;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + legajo;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (this.getClass() != obj.getClass()) return false;
		Alumno other = (Alumno) obj;
		if (legajo != other.legajo) return false;
		return true;
	}


	public int getLegajo() {
		return legajo;
	}


	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}


	public float getAltura() { return altura; }
	public void setAltura(float altura) { this.altura = altura; }
	public Fecha getNacimiento() { return nacimiento;}
	public void setNacimiento(Fecha nacimiento) { this.nacimiento = nacimiento;}
	public int getEdad() { return edad; }
	public void setEdad(int edad) { this.edad = edad;}
}
//private default protected Public
