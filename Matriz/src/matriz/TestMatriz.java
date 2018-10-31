package matriz;

import java.util.Scanner;

public class TestMatriz {

	public static int[][] crear(int filas, int columnas) {
		if(filas < 2 ) throw new RuntimeException("La matirz no puede tener menos de una fila "+filas);
		if(columnas < 2) throw new RuntimeException("La matriz no puede tener menos de una columna "+columnas);
		return new int[filas][columnas];
	}
	public static int[][] cargar(int[][] matriz) {
		int n;
		Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
		for(int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				System.out.printf("Introduzca un número entero; ");
				n = sc.nextInt();
				matriz[fila][col]=n;
			}
		}
		return matriz;
	}

	
	public static void main(String[] args) {
		int[][] matriz1;
		int[][] matriz2;
		matriz1 = cargar(crear(3,3));
		matriz2 = cargar(crear(3,3));
		mostrar(matriz1);
		mostrar(matriz2);
		mostrar(sumar(matriz1,matriz2));
		System.out.println();
		mostrar(MatrizMat.producto(matriz1,matriz2));
	}
}
