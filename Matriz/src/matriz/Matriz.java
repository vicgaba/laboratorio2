package matriz;

public class Matriz {
	private int filas, columnas;
	private int[][] datos;

	public Matriz(int filas, int columnas) {
		
	}
	public static void mostrar(int[][] matriz) {
		for(int fila = 0; fila < matriz.length; fila++) {
			System.out.println();
			for (int col = 0; col < matriz[fila].length; col++) {
				System.out.printf("%4d", matriz[fila][col]);
			}
		}
	}
	public int getFilas() {
		return filas;
	}
	public int getColumnas() {
		return columnas;
	}
}