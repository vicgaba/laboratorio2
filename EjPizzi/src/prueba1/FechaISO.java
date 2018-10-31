package prueba1;


public class FechaISO implements Cloneable { //implemento la interfaz de cloanción
	private int dia, mes, año;
	private int iso;

	private static int[] cantDias = {31,28,31,30,31,30,31,31,30,31,30,31}; //arreglo con la cantidad de días de cada mes
	
	public FechaISO(int dia, int mes, int año) {  
		this.setAño(año);
		this.setMes(mes);
		this.setDia(dia);
		this.iso = this.formatoISO();
	}
	public int diasMes(int mes) { //si el mes es febrero(2) verifica si el año es bisiesto, si lo es devuelve 29, sino 28 o la cantidad en el arreglo de cantDias 
		if (mes==2) return this.esBisiesto() ? 29 : 28;
		return cantDias[mes-1];
	}
	public int formatoISO() { //devuelve el formato ISO, verifica de pasar la cantidad correcta de dígitos
		return Integer.parseInt(String.format("%04d%02d%02d", this.año,this.mes,this.dia));
	}
	public boolean esBisiesto() { //bisiesto si es divisiblo por 400 o si es divisible por 4 y no por 100
		return ((this.año % 4 == 0)&&(this.año % 100 !=0))||(this.año % 400 == 0); 
	}
	@Override
	public FechaISO clone() {
		FechaISO fecha=null;
		try {
			fecha = (FechaISO)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return fecha;
	}
    public boolean esAnterior(FechaISO fecha) { return this.iso < fecha.iso; }
    public boolean esPosterior(FechaISO fecha) {
    	if (this.esAnterior(fecha)) return false;
    	return ! this.equals(fecha);
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iso;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		FechaISO other = (FechaISO) obj;
		if (iso != other.iso) return false;
		return true;
	}
	public FechaISO max(FechaISO fecha) { return this.esAnterior(fecha) ? fecha: this;}
	public FechaISO min(FechaISO fecha) { return this.esAnterior(fecha) ? this: fecha;}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAño() {
		return año;
	}
	protected void setDia(int dia) {
		if ((dia < 1)||(dia>this.diasMes(this.mes))) throw new RuntimeException("Dia incorrecto: "+dia);
		this.dia = dia;
	}
	protected void setMes(int mes) {
		if ((mes < 1)||(mes>12)) throw new RuntimeException("Mes incorrecto: "+mes);
		this.mes = mes;
	}
	protected void setAño(int año) {
		this.año = año;
	}
	@Override
	public String toString() {
//		return String.format("%02d", this.dia)+"/"+String.format("%02d", this.mes)+"/"+String.format("%04d", this.año);
		return String.format("%02d/%02d/%04d", this.dia, this.mes, this.año);
	}
}