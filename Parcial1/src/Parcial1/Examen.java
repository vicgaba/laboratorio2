package Parcial1;

public class Examen {
	
	public static long factorial(int n) {
		if(n<0) throw new RuntimeException("No hay factorial para negativo");
		if(n==1) return 1;
		return n * factorial(n-1);
	}
	public static void main0(String[] args) {
		System.out.println(factorial(4));
	}
	public static void main(String[] args) {
		int a=0; int b=2;
		for(int i=b; i < 10; i++) 
			if ((i%2) != 0) {
				a += 2;
			}
	}
	public static void main2(String[] args) {
		int o=1;
		foo(o,"ABCDEFG");
		System.out.println(o);
	}
	public static void foo(int p, String s) {
		int i = p;
		for(;i < s.length(); i++) {
			if((s.charAt(i)%2)==0) {
				System.out.println(i);
			}
		}
		p=i;
	}
}
