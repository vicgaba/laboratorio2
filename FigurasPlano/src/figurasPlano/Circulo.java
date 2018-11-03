package figurasPlano;

import java.awt.Graphics2D;

public class Circulo extends Figura {

	private double radio;

	public Circulo(Punto ubicacion, double radio) {
		super(ubicacion);
		this.setRadio(radio);
	}
	@Override
	public double area() {
		return Math.PI * (this.radio * this.radio);
	}
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void dibujar(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

		

}
