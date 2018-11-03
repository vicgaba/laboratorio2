package figurasPlano;

import java.awt.Graphics2D;

public abstract class Figura {
	private int id;
	private Punto ubicacion;
	
	public Figura(Punto ubicacion) {
		this.setUbicacion(ubicacion);
	}
	public abstract double area();
	
	public abstract double perimetro();
	
	public abstract void dibujar(Graphics2D g);
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Punto getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Punto ubicacion) {
		this.ubicacion = ubicacion;
	}

	
}
