package prueba;

public class Primo {
	public static String reverso(String str) {
		String str2="";
		for(int i = str.length();i>0;i--) {
			str2 += str.charAt(i-1);
		}
		return str2;
	}
	public static int fibo(int n) {
		if (n<0) throw new RuntimeException("No existe un numero en la serie negativa: "+n);
		return (n==0 || n==1) ? 1 : fibo(n-1)+fibo(n-2);
	}
	public static boolean esPrimo(int n) {
		if(n<2) return false;
		for(int i=2; i< n; i++) {
			if((n%i)==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
//		System.out.println(esPrimo(3));
//		System.out.println(fibo(2));
		System.out.println(reverso("Julieta"));
	}
}
