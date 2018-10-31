package prueba1;

public class Matriz {
	private int filas, columnas;
	private int[][] datos;
	
	public Matriz(int filas, int columnas) {
		
	}
	public Matriz multiplicar(Matriz matriz) {
		Matriz c = new Matriz(this.filas, matriz.columnas);
		
		return c;
	}
	public int getFilas() {
		return filas;
	}
	public int getColumnas() {
		return columnas;
	}
}
