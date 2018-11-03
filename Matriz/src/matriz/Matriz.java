package matriz;

import java.io.PrintStream;

public class Matriz {
	private int filas, columnas;
	private Object[][] datos;

	public Matriz(int filas, int columnas) {
		if(filas < 1) throw new RuntimeException("El número de filas no puede ser menor a 1"+filas);
		if(columnas < 1) throw new RuntimeException("El número de columas no puede ser menor a 1"+columnas);
		this.filas = filas;
		this.columnas = columnas;
		this.datos = new Object[filas][columnas];
	}
	public void putAll(Object elto) {
		for(int i = 0; i <= this.filas; i++) {
			for (int j = 0; j <= this.columnas; j++) {
				this.datos[i][j] = elto;
				this.put(i,j, elto);
				}
		}
	}
	public void print(PrintStream salida) {
		for(int i = 1; i <= this.filas; i++) {
			System.out.println();
			for (int j = 1; j <= this.columnas; j++) {
				salida.printf("%5s",this.get(i,j).toString());
			}
		}
	}

	public Object get(int fila, int columna) {
		return this.datos[fila-1][columna-1];
	}
	public void put(int fila, int columna, Object elto) {
		this.datos[fila-1][columna-1] =  elto;
	}
	public int getFilas() {
		return filas;
	}
	public int getColumnas() {
		return columnas;
	}
	public void init() {
		// TODO Auto-generated method stub
		
	}
}