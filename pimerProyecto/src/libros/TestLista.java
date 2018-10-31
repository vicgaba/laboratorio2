package libros;

import java.util.LinkedList;

import java.util.List;

public class TestLista {
	private static List<Autor> colAutores = new LinkedList<Autor>();
	public static void main(String[] args) {
		Autor autor = new Autor(1, "Stephen King");
		autor.agregar(new Libro("1","It",500));
		autor.agregar(new Libro("2","El resplandor", 600));
		colAutores.add(autor);
		Autor autor1 = new Autor(1, "Ayn Rand");
		autor.agregar(new Libro("10","La rebelión de atlas",1100));
		colAutores.add(autor);
		System.out.println("Autor: "+autorProlifico(colAutores));
		Libro a = libroConMasPaginas(colAutores);
		System.out.println("El libro con más páginas: "+a);
		System.out.println("Fue escrito por: "+a.getAutor());
		/*LinkedList<Autor> lista =  new LinkedList<Autor>();
		lista.add(new Autor("Jose"));
		lista.add(new Autor("María"));
		lista.add(new Autor("Alberto"));
		lista.add(new Autor("Carlos"));
		System.out.println(lista);
		for(Autor autor : lista) {
			System.out.println(autor);*/
		}
	public static Autor autorProlifico(List<Autor> col) {
		int max = 0; Autor seleccionado = null;
		for(Autor autor : col) {
			int total = 0;
			for(Libro libro : autor.libros()) {
				total += libro.getCantPaginas();
			}
			if (total > max) {
				max = total; seleccionado = autor;
			}
		}
		return seleccionado;
	}
	public static Libro libroConMasPaginas(List<Autor> col) {
		int max=0; Libro seleccionado=null;
		for(Autor autor : col) {
			for(Libro libro : autor.libros()) {
				if (libro.getCantPaginas()>max) {
				max = libro.getCantPaginas();
				seleccionado = libro;
			}
		}
		}
		return seleccionado;
	}
}
