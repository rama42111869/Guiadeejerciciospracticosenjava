
public interface FuncionesVideoStore {
	void registraralquiler();
	void comprobarstock();
	String generarboleta(String nombre,String Direccion, int telefono);
	void fechadevolucion(int dia,int mes,int anio);
	void registrarydevolver();
	
}
