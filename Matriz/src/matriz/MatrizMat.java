package matriz;

public class MatrizMat extends Matriz {
	
	public MatrizMat(int filas, int columnas) {
		super(filas, columnas);
	}
	public MatrizMat multiplicar(MatrizMat matriz) {
		if(!this.sonConformes(matriz)) throw new RuntimeException ("No no y no");
		MatrizMat m = new MatrizMat(this.getFilas(), matriz.getColumnas());
		for(int i=1; i <= this.getFilas(); i++) {
			for(int j=1; j <= this.getColumnas(); j++) {
				double total = 0;
				for(int k=1; k <= this.getColumnas(); k++) {
					total += (double)this.get(i,k) * (double)matriz.get(k,i);
					m.put(i, j, total);
				}
			}
		}
		return m;
	}
	public boolean sonConformes(MatrizMat matriz) {
		return this.getColumnas()==matriz.getFilas();
	}
	public void put(int fila, int columna, double nro) {
		super.put(fila, columna, nro);
	}
	public void putAll(double elto) {
		super.putAll(elto);
	}
	@Override
	public void put(int fila, int columna, Object obj) {
		throw new RuntimeException("Matriz matemática no puede trabajar con obj: "+obj);
	}
	@Override
	public void init() {
		this.putAll(0d);
	}
	
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
