package prueba;

public class Numero {
	private int valor;
	
	public Numero(int valor) {
		this.setValor(valor);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		if(valor < 0) throw new RuntimeException("El valor debe ser positivo");
		this.valor = valor;
	}
	public String toString() { return String.valueOf(this.valor);}

	public Numero sumar(Numero numero) {
		return new Numero(this.valor+numero.valor); 
	}
}
