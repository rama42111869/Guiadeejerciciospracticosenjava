
public class Prueba {
	
	private static int d;

	public static void main(String[] args) {
		
		System.out.println("\nEjercicio 1\n");
		Ejercicio1 e1=new Ejercicio1();
		Ejercicio1 e2=new Ejercicio1();
		e2.setAutornombre("Mario");
		e2.setAutorapellido("Lopez");
		e1.setGenero('m');
		e1.setAutorapellido("Bloch");
		e1.setAutornombre("Joshua");
		e1.setLibro("Effective Java");
		e1.setPrecio(450);
		e1.setStock(150);
		e1.setMail("joshua@email.com");
		System.out.println("Datos del libro\n"+e1.toString2());
		e1.setPrecio(500);
		e1.setStock(200);
		System.out.println("\nDatos del autor\n"+e1.toString3());
		System.out.println("\n"+e1.toString()+"\n");
		System.out.println("\nEl libro " + e1.getLibro() + "de " + e1.getAutornombre() +" "+ e1.getAutorapellido()+" Y "+e2.getAutornombre() + e2.getAutorapellido() + " se vende a " + e1.getPrecio());

		System.out.println("\nEjercicio 2\n");
		Ejercicio2b e3=new Ejercicio2b();
		e3.setNombre("Mario");
		e3.setPorcentaje(0.15);
		e3.setEmail("Mario@gmail.com");
		d=e3.id(1000000);
		System.out.print("Clave ");
		e3.arrs(10);
		System.out.print(e3.getNombre());
		e3.arrs(10);
		System.out.println("\nID= "+d+" "+e3.toString());
	}

}
