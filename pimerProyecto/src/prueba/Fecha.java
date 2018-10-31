package prueba;

public class Fecha implements Cloneable{

	private int dia,mes, año;

	public Fecha(int dia, int mes, int año) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAño(año);
	}
	public Fecha(String fecha) {
		prueba.Fecha.fromString(fecha);
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
@Override
	public Fecha clone() {
		Fecha copia = null;
		try {
			copia = (Fecha)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return copia;
	}
	@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + año;
	result = prime * result + dia;
	result = prime * result + mes;
	return result;
}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (año != other.año)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	
@Override
	public String toString() {
	 	return String.format("%02d/%02d/%04d", this.dia, this.mes, this.año);
	}
	public static Fecha fromString(String fecha) {
		if (fecha.length() != 10) throw new RuntimeException("No es el formato correcto");
		int dia = Integer.parseInt(fecha.substring(0,2));
		int mes = Integer.parseInt(fecha.substring(3,5));
		int año = Integer.parseInt(fecha.substring(6,9));
		return new Fecha(dia,mes,año);
	}
}
