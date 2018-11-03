package figurasPlano;

import java.util.LinkedList;

public class Plano {

	private int ancho, alto, umbral;
	private int idGen=0;
	private LinkedList<Figura>figuras = new LinkedList<Figura>();
	
	public Plano(int alto, int ancho, int umbral) {
		this.setAlto(alto);
		this.setAncho(ancho);
		this.setUmbral(umbral);
	}
	public boolean agregar(Figura figura) {
		if(figura.area() > this.areaDisponible()) return false;
		figura.setId(++this.idGen);
		this.figuras.add(figura);
		return true;
	}
	public double areaDisponible() {
		return this.area()*this.umbral/100d - this.areaOcupada();
	}
	public double areaOcupada() {
		double total = 0;
		for(Figura fig : this.figuras) {
			total += fig.area();
		}
		return total;
	}
	public double area() {
		return this.alto * this.ancho;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		if(ancho < 0) throw new RuntimeException("Valor incorrecto para anchura: "+ancho);
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		if(alto < 0) throw new RuntimeException("Valor incorrecto para altura: "+alto);
		this.alto = alto;
	}
	public int getUmbral() {
		return umbral;
	}
	public void setUmbral(int umbral) {
		if(umbral < 1 || umbral > 100) throw new RuntimeException("Valor de umbral fuera de rango"+umbral);
		this.umbral = umbral;
	}
	
	
	
}
