
public class Ejercicio1 {

	private String libro;
	private double precio;
	private int stock;
	private String autornombre;
	private String autorapellido;
	private String mail;
	private char genero;
	public String getLibro() {
		return libro;
	}
	public void setLibro(String libro) {
		this.libro = libro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getAutornombre() {
		return autornombre;
	}
	public void setAutornombre(String autornombre) {
		this.autornombre = autornombre;
	}
	public String getAutorapellido() {
		return autorapellido;
	}
	public void setAutorapellido(String autorapellido) {
		this.autorapellido = autorapellido;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public String toString2() {
		return "[libro=" + this.getLibro() + ", precio=" + this.getPrecio() + ", stock=" + this.getStock() + ", autornombre=" + this.getAutornombre()+ ", autorapellido=" + this.getAutorapellido() + ", mail=" + this.getMail() + ", genero=" + this.getGenero() + "]";
	}
	
	public String toString3() {
		return "[autornombre=" + this.getAutornombre() + ", autorapellido=" + this.getAutorapellido() + ", mail=" + this.getMail()+ ", genero=" + this.getGenero() + "]";
	}
	@Override
	public String toString() {
		return "El libro " + this.getLibro() + "de " + this.getAutornombre() + this.getAutorapellido() + " se vende a " + this.getPrecio() ;
	}
	
	
}
