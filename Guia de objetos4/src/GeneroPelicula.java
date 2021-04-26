public class GeneroPelicula extends Cliente{

	protected String titulo;
	private int anio;
	private int mes;
	private int dia;
	private double duracionminutos;
	private String Clasificacion;
	private String paisorigen;
	private String descripcion;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
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
	public double getDuracionminutos() {
		return duracionminutos;
	}
	public void setDuracionminutos(double duracionminutos) {
		this.duracionminutos = duracionminutos;
	}
	public String getClasificacion() {
		return Clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		Clasificacion = clasificacion;
	}
	public String getPaisorigen() {
		return paisorigen;
	}
	public void setPaisorigen(String paisorigen) {
		this.paisorigen = paisorigen;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public String toString() {
		return "\n\n\ntitulo=" + this.getTitulo() + "\nanio=" +this.getAnio() + "\nmes=" + this.getMes() + "\ndia=" +this.getDia()
				+ "\nduracion en minutos=" + this.getDuracionminutos() + "\nClasificacion=" + this.getClasificacion() + "\npais de origen="
				+ this.getPaisorigen() + "\ndescripcion=" + this.getDescripcion();
	}
	}
