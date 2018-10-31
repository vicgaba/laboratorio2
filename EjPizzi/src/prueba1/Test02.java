package prueba1;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		int[][] m1 = cargar(crear(2, 3)),
				m2 = cargar(crear(3, 2));
		mostrar("Matriz A", m1);
		mostrar("Matriz B", m2);
		mostrar("  A x B ", multiplicar(m1, m2));
	}
	public static int[][] multiplicar(int[][]a, int[][]b){
		if(a.length!=b[0].length || a[0].length!=b.length) throw new RuntimeException("La fila de la amtriz A debe ser igual a la columna de la matriz B");
		int matriz[][] = new int[a.length][a[0].length];
		for(int fila=0;fila<a.length;fila++) {
			for(int columna=0;columna<b[fila].length;columna++) {
				for(int k=0;k<a[0].length;k++) {
					matriz[fila][columna]+=a[fila][k]*b[k][columna];
				}
			}
		}		
		return matriz;
	}
	public static int[][] crear(int filas, int columnas){
		if (filas < 2) throw new RuntimeException("La matriz debe tener mas de 1 fila: "+filas);
		if (columnas < 2) throw new RuntimeException("La matriz debe tener mas de 1 columna: "+columnas);
		return new int[filas][columnas];
	}
	public static int[][] cargar(int[][] matriz){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<matriz.length; i++) {
			System.out.println("Fila: "+i);
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print("Columna: "+j);
				matriz[i][j] = sc.nextInt();
			}
		}

		return matriz;
	}
	public static void mostrar(String titulo, int[][] matriz) {
		System.out.println("\n"+titulo);
		for(int i=0; i<matriz.length; i++) {
			System.out.println();
			for(int j=0; j<matriz[i].length; j++) {
				System.out.printf("%3d", matriz[i][j]);
			}
		}
	}
	public static boolean esContenido(String subStr, String str) {
		int tam_str = str.length();
		int tam_sub = subStr.length();

		int i=0;
		int j= 0;

		while (i < tam_str && j < tam_sub ) {
			if (str.charAt(i) == subStr.charAt(j)) 	j++;
			else j = 0;
			i++;
		}
		return (j == tam_sub);
	}

}
