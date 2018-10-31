package prueba1;

public class TestFecha {
	public static void main(String[] args) {
		FechaISO f = new FechaISO(29,2,2016), f2 = new FechaISO(28,2,2016);
		System.out.println(f.max(f2));
		System.out.println(f.equals(f2));
		System.out.println(f.esBisiesto());
	}
}
