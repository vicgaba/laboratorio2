package prueba;

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
	public static void mostrar(int[][] matriz) {
		for(int fila = 0; fila < matriz.length; fila++) {
			System.out.println();
			for (int col = 0; col < matriz[fila].length; col++) {
				System.out.printf("%4d", matriz[fila][col]);
			}
		}
	}
	public static int[][] sumar(int[][] matriz1, int[][] matriz2){
		int[][] matrizSuma = crear(matriz1.length,matriz2.length);
		if(matriz1.length!=matriz2.length) throw new RuntimeException ("No coinciden las filas y columnas para realizar la suma");
		for(int fila = 0; fila < matriz1.length; fila++) {
			for (int col = 0; col < matriz1[fila].length; col++) {
				if(matriz1[fila].length!=matriz2[fila].length) throw new RuntimeException ("No coinciden las filas y columnas para realizar la suma");
				matrizSuma[fila][col]=matriz1[fila][col]+matriz2[fila][col];
			}
		}
		return matrizSuma;
	}
	public static int[][] producto(int[][] matriz1, int[][] matriz2){
		int suma=0;
		if(matriz1.length != matriz2[1].length) throw new RuntimeException("Para el producto de matrices deben coincidir las filas de la 1° con las columnas de la 2°");
		int[][] matrizProducto = crear(matriz1.length,matriz2[1].length);
		for(int i = 0; i < matriz1.length; i++){
			for(int j = 0; j < matriz2[0].length; j++){
				suma = 0;
				for(int k = 0; k < matriz2.length; k++){
					suma += matriz1[i][k] * matriz2[k][j];
				}
				matrizProducto[i][j] = suma;
			}
		}
		return matrizProducto;
	}
	public static void main(String[] args) {
		int[][] matriz1;
		int[][] matriz2;
		matriz1 = cargar(crear(3,3));
		matriz2 = cargar(crear(3,3));
		mostrar(matriz1);
		mostrar(matriz2);
//		mostrar(sumar(matriz1,matriz2));
		System.out.println();
		mostrar(producto(matriz1,matriz2));
	}
}
