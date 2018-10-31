package prueba;

public class DecBinario {
	public static String decBinario (int n) {
		String binario = "";
		while(n>0) {
			binario= n%2 + binario;
			n = n/2;
		}
		return binario;
	}
	public static void main(String[] args) {
		System.out.println(decBinario(7));
		
	}
}