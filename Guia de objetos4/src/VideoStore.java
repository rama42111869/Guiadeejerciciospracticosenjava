public class VideoStore implements FuncionesVideoStore{


	private String nombre;
	private String direccion;
	private int telefono;
	private int anio;
	private int mes;
	private int dia;
	
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "VideoStore \nnombre=" + this.getNombre() + "\ndireccion=" + this.getDireccion() + "\ntelefono=" + this.getTelefono();
	}
	
	@Override
	public void registraralquiler() {
		
		
	}
	
	@Override
	public void comprobarstock() {

		
	}
	
	@Override
	public String generarboleta(String nombre,String Direccion, int telefono) {
		String cartel="Datos del cliente: "+"\n";
		cartel=this.nombre+"\n"+this.direccion+"\n"+this.telefono+"\n";
		return cartel;
	}
	
	@Override
	public void fechadevolucion(int dia,int mes,int anio) {
	System.out.println(dia+" "+mes+" "+anio);
	}
	
	@Override
	public void registrarydevolver() {
		// TODO Auto-generated method stub
		
	}
}
