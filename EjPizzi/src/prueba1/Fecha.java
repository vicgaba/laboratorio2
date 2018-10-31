package prueba1;

public class Fecha implements Cloneable{
	private int dia, mes, año;
	private int iso;

	private static int[] diasDelMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Fecha(int dia, int mes, int año) {
		this.setAño(año);
		this.setMes(mes);
		this.setDia(dia);
		this.iso = this.representacionISO();
	}
	public Fecha() {
		this(22,9,2018);
	}
	public Fecha(String fecha) {
		Fecha f = Fecha.fromString(fecha);
		this.dia = f.dia;
		this.mes = f.mes;
		this.año = f.año;
		this.iso = f.iso;
	}
	public static Fecha fromString(String fecha) {
		if (fecha.length() != 10) throw new RuntimeException("Formato de fecha incorrecto: "+fecha);
		int dia = Integer.parseInt(fecha.substring(0, 2));
		int mes = Integer.parseInt(fecha.substring(3, 5));
		int año = Integer.parseInt(fecha.substring(6, 10));
		return new Fecha(dia, mes, año);
	}
	public int representacionISO(){ return Integer.parseInt(String.format("%04d", this.año)+String.format("%02d", this.mes)+String.format("%02d", this.dia)); }
	public int diasDe(int mes) {
		if (mes==2) return this.esBisiesto() ? 29 : 28;
		return Fecha.diasDelMes[mes-1];
	}
	public int diaDelaño() {
		int total=0;
		for(int i = 1; i < this.mes; i++) {
			total += this.diasDe(i);
		}
		return total + this.dia;
	}
	public int diasDelaño() { return this.esBisiesto() ? 366 : 365; }
	public int diasHastaFinDeaño(){
		return this.diasDelaño() - this.diaDelaño();
	}
	public Fecha max(Fecha fecha) { return this.esAnterior(fecha)? fecha : this; }
	public Fecha min(Fecha fecha) { return this.esAnterior(fecha)? this : fecha; }
	public int diferencia(Fecha fecha) {
		int total = 0;
		Fecha inicio = this.min(fecha).clone(), fin = this.max(fecha);
		for(Fecha f = inicio.masaño(1); f.esAnterior(fin); f.masaño(1)) {
			total += f.diasDelaño(); 
		}
		return inicio.diasHastaFinDeaño() + total + fin.diaDelaño();
	}
	public boolean esBisiesto() {
		return ((this.año % 4 == 0 && this.año % 100 != 0)|| this.año % 400 == 0);
	}
	public Fecha masaño(int cantaños){
		this.setAño(this.getAño() + cantaños);
		return this;
	}
	public Fecha incaño(){
		this.setAño(this.año + 1);
		return this;
	}
	public Fecha incMes(){
		if (this.mes == 12){
			this.incaño();
			this.mes = 1;
		}else{
			this.mes++;
		}
		return this;
	}
	public Fecha masDias(int dias){
		Fecha f; int i;
		for(f = this.clone(); dias >= f.diasDelaño(); f.masaño(1)){
			dias -= f.diasDelaño();
		}
		if (this.getAño()!=f.getAño()) i = 1;
        else i = this.mes;
        for(int j = i; dias > f.diasDe(j); f.incMes()){
			dias -= this.diasDe(j);
		}
        int supera = this.dia + dias - f.diasDe(f.mes);
        if (supera > 0){
        	f.incMes();
        	f.dia = supera;
        }else f.setDia(f.getDia()+dias);

		return f;
	}
	public boolean esAnterior(Fecha fecha) { return this.iso < fecha.iso; }
	public boolean esPosterior(Fecha fecha) {
		if (this.esAnterior(fecha)) return false;
		return !this.equals(fecha);
	}
	@Override
	public Fecha clone() {
		Fecha copia = null;
		try {
			copia = (Fecha) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return copia;
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
		Fecha other = (Fecha) obj;
		if (iso != other.iso) return false;
		return true;
	}
	public int getDia() {
		return dia;
	}
	protected void setDia(int dia) {
		if ((dia < 1)||(dia > this.diasDe(this.mes))) throw new RuntimeException("El d�a es incorrecto: "+dia);
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	protected void setMes(int mes) {
		if ((mes < 1)||(mes > 12)) throw new RuntimeException("El mes es incorrecto: "+mes);
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	protected void setAño(int año) {
		this.año = año;
	}
	@Override
	public String toString() {
		return String.format("%02d/%02d/%04d", this.dia, this.mes, this.año);
	}
}