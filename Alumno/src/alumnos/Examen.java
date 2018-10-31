package alumnos;
import java.time.LocalDate;

public class Examen {
	private LocalDate fecha;
	private int nota;
	private Alumno alumno;

	public Examen(int nota) {
		this.setNota(nota);
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return this.alumno.getNombre() + ". nota: " + this.nota;
	}
}
