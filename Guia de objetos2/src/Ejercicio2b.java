///Venta del local
public class Ejercicio2b extends Ejercicio2{
	
	
	private int nros;
	private String caracteres;
	private double monto;
	private int dia;
	private int mes;
	private int anio;
	
	public int getNros() {
		return nros;
	}
	public void setNros(int nros) {
		this.nros = nros;
	}
	public String getCaracteres() {
		return caracteres;
	}
	public void setCaracteres(String caracteres) {
		this.caracteres = caracteres;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
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
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		return "Fecha "+this.getDia()+"/"+this.getMes()+"/"+this.getAnio()+" Monto "+this.getMonto()+"Descuento "+this.getPorcentaje()+"Nombre del cliente "+this.getNombre()+"Mail del cliente "+this.getEmail();
	}
	
	
}
