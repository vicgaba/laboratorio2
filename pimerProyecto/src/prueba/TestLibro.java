package prueba;

public class TestLibro {
	public static void main(String[] args) {
		Libro libro = new Libro("98020","La rebelión de Atlas");
		Autor autor = new Autor("Ayn","Rand");
		libro.setAutor(autor);
		System.out.println(libro);
	}

}
