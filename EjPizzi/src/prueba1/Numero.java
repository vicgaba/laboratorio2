package prueba1;

public class Numero {
	private int valor;
	
	public Numero(int valor) {
		this.setValor(valor);
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		if (valor < 0) throw new RuntimeException("El valor debe ser positivo: "+valor);
		this.valor = valor;
	}
	public Numero sumar(Numero nro) {
		return new Numero(this.valor + nro.valor);
	}
	public String toString() { return String.valueOf(this.valor); }
}
