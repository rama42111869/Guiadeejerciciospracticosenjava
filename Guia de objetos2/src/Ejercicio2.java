///Cliente

public class Ejercicio2 {

	private String nombre;
	private String email;
	private double porcentaje;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	
	
	@Override
	public String toString() {
		return "nombre=" + this.getNombre() + ", email=" + this.getEmail() + ", descuento=" + this.getPorcentaje();
	}
	public void arrs(int nros)
	{
		int i=0,a=0;
		while(i<7)
		{
		i=(int) (Math.random()*nros);
		a=i;
		System.out.print(a);
		}
	}
	
	public int id(int nros)
	{

		int i=0,a=0;
		while(i<7)
		{
		i=(int) (Math.random()*nros);
		a=i;
	}
		return a;
	}
}
