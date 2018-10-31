package prueba;

public class Binario {
	public static String bin(int n) {
		char[] v= new char[32];
		
		for(int i=31;i>=0;i--) {
			if ((n&1) == 1) {
				v[i]='1';
			} else {
				v[i]='0';
			}
			n=n>>1;
		}
		return String.valueOf(v);
	}
	public static void main(String[] args) {
		System.out.println(bin(35));
	}
}