import java.util.ArrayList;

public class Prueba {
	
	private static double d,e,f;
	
	public static void main(String[] args) {
	
	System.out.println("\n-------------------------------------------------------\n");
	Circulo c1=new Circulo(d, null);
	c1.setColor("Rojo");
	c1.setRadio(1.0);
	d=c1.getRadio();
	e=c1.area(d);
	System.out.println(c1.toString()+" "+"Area= "+e+"\n");
	
	Cilindro c2=new Cilindro(d, null);
	c2.setAltura(1.0);
	c2.setColor("Rojo");
	c2.setRadio(1.0);
	d=c2.getRadio();
	e=c2.getAltura();
	f=c2.volumen(d, e);
	System.out.println("\n"+c2.toString()+" Base "+c2.area(d) +" Volumen"+f+"\n"+"Area del cilindro="+c2.area(d,1.0,e));
	
	
	
	System.out.println("\n-------------------------------------------------------\n");
	Estudiante e1=new Estudiante();
	e1.setApellido("Garcia");
	e1.setAñodeingreso(2019);
	e1.setCarrera("Derecho");
	e1.setCoutamensual(2000);
	e1.setDireccion("Av 123");
	e1.setDNI(42111869);
	e1.setEmail("Rr@gmail.com");
	e1.setNombre("Sergio");
	
	Estudiante e2=new Estudiante();
	e2.setApellido("Conte");
	e2.setAñodeingreso(2020);
	e2.setCarrera("Administracion");
	e2.setCoutamensual(2100);
	e2.setDireccion("Av 123");
	e2.setDNI(42111899);
	e2.setEmail("asdr@gmail.com");
	e2.setNombre("Mariano");
	
	Estudiante e3=new Estudiante();
	e3.setApellido("Paredes");
	e3.setAñodeingreso(2018);
	e3.setCarrera("Informatica");
	e3.setCoutamensual(2100);
	e3.setDireccion("Av 123");
	e3.setDNI(42111891);
	e3.setEmail("asda3r@gmail.com");
	e3.setNombre("Armando");
	
	Estudiante e4=new Estudiante();
	e4.setApellido("Parrilla");
	e4.setAñodeingreso(2018);
	e4.setCarrera("Informatica");
	e4.setCoutamensual(1900);
	e4.setDireccion("Av 123");
	e4.setDNI(42111891);
	e4.setEmail("samuel@gmail.com");
	e4.setNombre("Samuel");
	
	ArrayList<Estudiante>estudiantes=new ArrayList<Estudiante>(4);

	
	}
}
