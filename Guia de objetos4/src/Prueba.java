import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

	private static Scanner pauser;
	private static int a,b,c,d,e,f;
	public static void main(String[] args) {
			
		pauser = new Scanner (System.in);
		GeneroPelicula g1=new GeneroPelicula();
		g1.setTitulo("Godzila");
		g1.setClasificacion("PG-13");
		g1.setAnio(1999);
		g1.setDia(13);
		g1.setMes(4);
		g1.setDuracionminutos(120);
		g1.setDescripcion("El rey de los monstruos");
		g1.setPaisorigen("Japon");
		
		GeneroPelicula g2=new GeneroPelicula();
		g2.setTitulo("Godzila 2");
		g2.setClasificacion("PG-13");
		g2.setAnio(2000);
		g2.setDia(13);
		g2.setMes(4);
		g2.setDuracionminutos(120);
		g2.setDescripcion("El rey de los monstruos regresa");
		g2.setPaisorigen("Japon");
		
		GeneroPelicula g3=new GeneroPelicula();
		g3.setTitulo("Godzila 3");
		g3.setClasificacion("PG-13");
		g3.setAnio(2001);
		g3.setDia(13);
		g3.setMes(4);
		g3.setDuracionminutos(120);
		g3.setDescripcion("El final del rey de los monstruos");
		g3.setPaisorigen("Japon");
		
		GeneroPelicula g4=new GeneroPelicula();
		g4.setTitulo("Godzila 4");
		g4.setClasificacion("PG-13");
		g4.setAnio(2003);
		g4.setDia(13);
		g4.setMes(4);
		g4.setDuracionminutos(120);
		g4.setDescripcion("La resurreccion de godzila");
		g4.setPaisorigen("Japon");
		
		GeneroPelicula g5=new GeneroPelicula();
		g5.setTitulo("Godzila 5");
		g5.setClasificacion("PG-13");
		g5.setAnio(2005);
		g5.setDia(13);
		g5.setMes(4);
		g5.setDuracionminutos(120);
		g5.setDescripcion("Godzila vs mecha-Godzila");
		g5.setPaisorigen("Japon");
		
		VideoStore v1=new VideoStore();
		v1.setDireccion("Av Independencia 1641");
		v1.setNombre("Bloddy tears");
		v1.setTelefono(4871785);
		System.out.println("Datos del local:"+v1.toString());	
		
		ArrayList<GeneroPelicula>accion=new ArrayList<GeneroPelicula>(10);
		ArrayList<Cliente>cliente=new ArrayList<Cliente>(10);
		
		accion.add(0, g1);
		accion.add(1, g2);
		accion.add(2, g3);
		accion.add(3, g4);
		accion.add(4, g5);
		System.out.println("\nPeliculas en stock de accion"+accion);
		
        System.out.println("\n\nPress Any Key To Continue...\n\n");
        pauser.nextLine();
		
		Cliente c1=new Cliente();
		c1.setDireccion("Av. Carlos Gardel 737");
		c1.setNombre("Ramiro");
		c1.setTelefono(4651930);

		
		System.out.println("Datos del cliente:"+c1.toString());
		accion.remove(0);
		cliente.add(0, g1);
		accion.remove(1);
		cliente.add(1, g2);
		accion.remove(2);
		cliente.add(2, g3);
		
		System.out.println("\n\n\nPeliculas alquiladas por el cliente"+cliente);

		v1.setAnio(2021);
		v1.setDia(14);
		v1.setMes(6);
		
		a=v1.getAnio();
		b=v1.getMes();
		c=v1.getDia();
		
		c1.setAnio(2021);
		c1.setDia(7);
		c1.setMes(6);
		
		d=c1.getAnio();
		e=c1.getMes();
		f=c1.getDia();
		
		System.out.println("\nnEl cliente alquilo las peliculas el dia "+e+" del mes "+f+" en el anio "+d+"\n");
		System.out.println("\nEl cliente debe devolver las peliculas el dia "+c+" del mes "+b+" en el anio "+a+"\n");
		
        System.out.println("\n\nUna semana despues...\n\n");
        pauser.nextLine();
        System.out.println("\n\nPress Any Key To Continue...\n\n");
        pauser.nextLine();	
		cliente.remove(0);
		accion.add(0,g1);
		cliente.remove(1);
		accion.add(1,g2);
        if(cliente.isEmpty())
		{
			System.out.println("\nEl cliente devolvio las peliculas\n");
		}
		else
			{
			System.out.println("\nEl cliente NO devolvio todas las peliculas, HORA DE COBRAR\n");	
			System.out.println("\nPeliculas restantes por devolver "+cliente);
			}
	}

}
