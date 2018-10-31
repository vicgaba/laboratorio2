package prueba1;

public class Test01 {
	public static String reverso(String str) {
		return null;
	}
	public static int fibo(int n){
		return (n == 0 || n == 1) ? n : fibo(n -1) + fibo(n - 2);
		
	}
    public static boolean esPrimo(int n) {
    	if (n==1) return false;
    	for(int i = 2; i < n; i++) {
    		if((n % i)==0) return false;
    	}
    	return true;
    }
    public static void main(String[] args) {
	}
}
