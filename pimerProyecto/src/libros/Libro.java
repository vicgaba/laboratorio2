package libros;

public class Libro {
	private String isbn;
	private String titulo;
	private int cantPaginas;
	private String editorial;
	private float precio;
	private int stock;
	private Autor autor;
	
	public Libro(String isbn, String titulo, int cantPaginas) {
		this.setIsbn(isbn);
		this.setTitulo(titulo);
		this.setCantPaginas(cantPaginas);
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getCantPaginas() {
		return cantPaginas;
	}
	public void setCantPaginas(int cantPaginas) {
		this.cantPaginas = cantPaginas;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return this.isbn + ". " + this.titulo + ". Páginas " + this.cantPaginas;
	}
	
}
