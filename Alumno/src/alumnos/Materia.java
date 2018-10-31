package alumnos;
import java.util.LinkedList;
import java.util.List;

public class Materia {

	private int id;
	private String titulo;
	private int cargaHoraria;
	private Alumno alumno;
	private List<Examen> examenes = new LinkedList<Examen>();

	public Materia(int id, String titulo) {
		this.setId(id);
		this.setTitulo(titulo);
	}

	public void agregar(Examen examen) {
		if (examen == null)
			return;
		examenes.add(examen);
	}

	public float promedio() {
		if (this.cantExamenes() == 0)
			return 0;
		return this.notaAcumulada() / this.cantExamenes();
	}

	public int notaAcumulada() {
		int total = 0;
		for (Examen examen : this.examenes) {
			total += examen.getNota();
		}
		return total;
	}

	public int cantExamenes() {
		return this.examenes.size();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo == null)
			throw new RuntimeException("no puede ser nulo");
		this.titulo = titulo.toUpperCase();
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

}
