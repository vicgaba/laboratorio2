package prueba;

public class Libro {
	private String isbn;
	private String titulo;
	private Autor autor;
	private String genero;
	private int cantidad;
	private float precioUnitario;
	
	public Libro (String isbn, String titulo) {
		this.setIsbn(isbn);
		this.setTitulo(titulo);
	}
	public void setIsbn(String isbn) {
		if (isbn == null) throw new RuntimeException("El ISBN no puede ser null");
		this.isbn = isbn;
	}
	public String getIsbn() {
		return this.isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if (titulo == null) throw new RuntimeException("El título no puede ser null");
		this.titulo = titulo.toUpperCase();
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		if (autor == null) return;
		autor.setLibro(this);
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		if (cantidad < 0) throw new RuntimeException("La cantidad no puede ser negativa");
		this.cantidad = cantidad;
	}
	public float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(float precioUnitario) {
		if (precioUnitario < 0) throw new RuntimeException("El precio no puede ser negativo");
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {  //sobre escribimos el método
		return this.isbn + ":" + this.titulo + " autor: " + autor.getNombre() + ", "+ autor.getApellido();
	}
	
}
