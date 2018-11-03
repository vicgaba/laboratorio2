package figurasPlano;
 
public class Rectangulo extends Figura {

	private int alto, ancho;
	public Rectangulo(Punto ubicacion, int alto, int ancho) {
		super(ubicacion);
		this.setAlto(alto);
		this.setAncho(ancho);
	}

	
	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public Punto getUbicacion() {
		// TODO Auto-generated method stub
		return super.getUbicacion();
	}

	@Override
	public void setUbicacion(Punto ubicacion) {
		// TODO Auto-generated method stub
		super.setUbicacion(ubicacion);
	}
	

}
