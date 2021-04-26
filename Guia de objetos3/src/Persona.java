
public abstract class Persona {
	private int DNI;
	private String nombre;
	private String apellido;
	private String email;
	private String direccion;
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Persona [DNI()=" + getDNI() + ", Nombre()=" + getNombre() + ", Apellido()=" + getApellido()
				+ ", Email()=" + getEmail() + ", Direccion()=" + getDireccion() + "]";
	}
	
	
}
