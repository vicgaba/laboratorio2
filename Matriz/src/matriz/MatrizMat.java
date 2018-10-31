package matriz;

public class MatrizMat extends Matriz {
	
	public static int[][] sumar(int[][] matriz1, int[][] matriz2){
		int[][] matrizSuma = TestMatriz.crear(matriz1.length,matriz2.length);
		if(matriz1.length!=matriz2.length) throw new RuntimeException ("No coinciden las filas y columnas para realizar la suma");
		for(int fila = 0; fila < matriz1.length; fila++) {
			for (int col = 0; col < matriz1[fila].length; col++) {
				if(matriz1[fila].length!=matriz2[fila].length) throw new RuntimeException ("No coinciden las filas y columnas para realizar la suma");
				matrizSuma[fila][col]=matriz1[fila][col]+matriz2[fila][col];
			}
		}
		return matrizSuma;
	}
	public Matriz multiplicar(Matriz matriz) {
		Matriz c = new Matriz(matriz.getFilas(), matriz.getColumnas());
		
		return c;
	}

	public static int[][] producto(int[][] matriz1, int[][] matriz2){
		int suma=0;
		if(matriz1.length != matriz2[1].length) throw new RuntimeException("Para el producto de matrices deben coincidir las filas de la 1° con las columnas de la 2°");
		int[][] matrizProducto = TestMatriz.crear(matriz1.length,matriz2[1].length);
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

}
