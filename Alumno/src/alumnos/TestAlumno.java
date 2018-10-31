package alumnos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.List;

public class TestAlumno {
	private static List<Materia> materia = new LinkedList<Materia>();
	private static Map<Integer, Materia> materias = new HashMap<Integer, Materia>();

	public static void main(String[] args) {
		Alumno alumno = new Alumno(1, 1, "José");
		alumno.inscribir(new Materia(348, "modelos 1"));
		alumno.inscribir(new Materia(349, "algoritmos 1"));
		alumno.inscribir(new Materia(345, "matematicas 1"));
		alumno.rendir(7, "Mod");
		alumno.rendir(8, "Mod");
		alumno.rendir(4, "mate");
//		alumno.rendir(18, "algo");
	//	alumno.rendir(6, "pepe");
		System.out.println("Promedio: " + alumno.promedio());
//		System.out.println(seleccion(materia, 0,1));
	}
	public static List<Alumno> seleccion(List<Alumno> col, int edMin, int edMax){
		List<Alumno> sel = new LinkedList<Alumno>();
		for(Alumno alumno : col) {
			int edad = alumno.edad();
			if(edad >= edMin && edad <= edMax) {
				if(alumno.promedio() >= 7) {
					sel.add(alumno);
				}
			}
		}
		return sel;
	}
}