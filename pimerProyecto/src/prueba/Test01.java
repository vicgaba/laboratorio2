package prueba;

public class Test01 {
	public static void rectangulo(int alto, int ancho) {
		if(alto>0 && ancho>0) {
			for (int j=0;j<alto; j++) {
				if(j==0 || j==alto-1) {
					for (int i=0;i<ancho;i++) {
						System.out.print("*");
					}
				} else {
					for (int i=0;i<ancho;i++) {
						if(i==0 || i==ancho-1) {
							System.out.print("*");
						} else { 
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		} else { 
			System.out.println("algun valor intoducido es menor a 1");
		}
	}
	public static long fact(int n) {
		if (n<0) throw new RuntimeException("No existe factorial para numeros negativos: "+n);
		if(n==0) return 1;
		else return n * fact(n-1);
	}
	public static long factorial(int n) {
		if (n<0) throw new RuntimeException("No existe factorial para numeros negativos: "+n);
		long factorial = 1;
		while (n !=0) {
			factorial = factorial * n;
			n--;
		}
		return factorial;
	}
	public static void main(String[] args) {
		Test01.rectangulo(6, 6);
//		System.out.println(factorial(-10));
		System.out.println(fact(3));
	}
}
