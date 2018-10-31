package alumnos;

//investigar HashMap
//"   ".indexOf("   ")>=0;

import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Alumno extends Persona {
	private int legajo;
	private Map<Integer, Materia> materias = new HashMap<Integer, Materia>();
	private List<Materia> materia = new LinkedList<Materia>();

	public Alumno(int dni, int legajo, String nombre) {
		super(dni, nombre);
		this.setLegajo(legajo);
	}

	public void inscribir(Materia materiaInsc) {
		//Verificar que el código de materia no exista anteriormente
		if (materiaInsc == null)
			throw new RuntimeException("El campo materia no puede ser nulo");
		int codigoMateria = materiaInsc.getId();
		for (Materia materia : materias.values()) {
			if(materia.getId()== codigoMateria) 
				throw new RuntimeException("Ya existe el código de materia");
		}
		materias.put(materiaInsc.getId(), materiaInsc);
	}

	public Materia buscar(String nombreMateria) {
		if (nombreMateria == null)
			return null;
		nombreMateria = nombreMateria.toUpperCase();
		for (Materia materia : materias.values()) {
			if (materia.getTitulo().indexOf(nombreMateria) >= 0)
				return materia;
		}
		return null;
	}

	public void rendir(int nota, String nombreMateria) {
		Materia materia = this.buscar(nombreMateria);
		if (materia == null)
			throw new AppException("No se encontró la materia " + nombreMateria);
		materia.agregar(new Examen(nota));
	}

	public void rendir(int codigoMateria, Examen examen) {
		Materia materia = this.materias.get(codigoMateria);
		if (materia == null)
			throw new AppException("No se encontró la materia con el código " + codigoMateria);
	}

	public float promedio() {
		int totalNota = 0, cant = 0;
		for (Materia materia : materias.values()) {
			totalNota += materia.notaAcumulada();
			cant += materia.cantExamenes();
		}
		return cant == 0 ? 0 : totalNota / cant;
	}
//	public Iterable<Materia> materias() { return this.materias; }

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
}
