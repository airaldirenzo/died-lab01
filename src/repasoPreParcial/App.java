package repasoPreParcial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("Renzo Airaldi", "468765");
		Alumno a2 = new Alumno("Roberto Carlos","135456");
		
		Docente d1 = new Docente("Pepe Gomez","pgomez@frsf.utn.edu.ar",16,200.0);
		Docente d2 = new Docente("Carlos Gutiererz","cgutierrez@frsf.utn.edu.ar",5,100.0);
		
		Capacitacion c1 = new Curso("Programacion basica",false,Tema.PROGRAMACION,false,d1,10,2,0);
		Capacitacion c2 = new Curso("Introduccion a Java avanzado",true,Tema.PROGRAMACION,true,d2,2,1,10);
		
		Capacitacion t1 = new Taller("Taller de programacion competitiva",true,Tema.PROGRAMACION,true,10,50.0,2,5);
		Capacitacion t2 = new Taller("Taller de IA basica",false,Tema.IA,false,5,25.0,1,1);
		
		List<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();
		
		capacitaciones.add(c1);
		capacitaciones.add(c2);
		capacitaciones.add(t1);
		capacitaciones.add(t2);
		
		//Capacitaciones
		System.out.println("Las capacitaciones son "+capacitaciones.stream().map(c -> c.getNombre()).collect(Collectors.toList()));
		
		//Creditos totales de todas las capacitaciones
		System.out.println("Otorgan "+Capacitacion.creditosTotales(capacitaciones)+" creditos.");
		
		//Costo total
		System.out.println("El costo total es de $"+Capacitacion.costoTotal(capacitaciones)+".");
				
		//Costo promedio
		System.out.println("El costo promedio es de $"+Capacitacion.costoPromedio(capacitaciones)+".");
		
		//Orden por costo
		System.out.println("Capacitaciones de PROGRAMACION ordenadas por costo: "+Capacitacion.ordenTemaxCostoD(capacitaciones, Tema.PROGRAMACION).stream().map(c -> c.getNombre()).collect(Collectors.toList()));
		System.out.println("Capacitaciones de IA ordenadas por costo "+Capacitacion.ordenTemaxCostoD(capacitaciones, Tema.IA).stream().map(c -> c.getNombre()).collect(Collectors.toList()));
		
		//Capacitaciones ordenadas por creditos otorgados
		System.out.println("Capacitaciones ordenadas por creditos otorgados "+Capacitacion.ordenCapacCreditosD(capacitaciones).stream().map(c -> c.getNombre()).collect(Collectors.toList()));
		
		//Docente del curso que mas creditos otorga
		System.out.println("El docente del curso que mas creditos da es: "+Curso.DocenteCursoMayorCantCreditos(capacitaciones).getNombre());
		
		//Inscripciones
		a1.inscribir(c1);
		System.out.println("\n" + a1.getNombre() + " inscripto a " + c1.getNombre() + ".");
		a2.inscribir(c1);
		System.out.println("\n" + a2.getNombre() + " inscripto a " + c1.getNombre() + ".");
		a1.inscribir(t1);
		a1.inscribir(t2);
		System.out.println("\n" + a2.getNombre() + " inscripto a " + t2.getNombre() + ".");
		
		//Creditos insuficientes
		a1.inscribir(c2);

		//Cupo lleno
		a2.inscribir(t2);

		//Aprobar sin estar inscripto
		try {
			a1.aprobar(c2);
		} catch (AlumnoNoInscriptoException e) {
			e.printStackTrace();
		}
		
		//Aprobar
		System.out.println("\nEl alumno " + a1.getNombre() + " tiene " + a1.cantCreditos() + " creditos.");
		try {
			a1.aprobar(c1);
		} catch (AlumnoNoInscriptoException e) {
			e.printStackTrace();
		}
		System.out.println("\n" + a1.getNombre() + " aprobo " + c1.getNombre() + ".");
		System.out.println("\nEl alumno " + a1.getNombre() + " tiene " + a1.cantCreditos() + " creditos.");
		
		// Ahora si le alcanzan los creditos
		a1.inscribir(c2);
		System.out.println("\n" + a1.getNombre() + " inscripto a " + c2.getNombre() + ".");

		// Aprueba
		try {
			a1.aprobar(c2);
		} catch (AlumnoNoInscriptoException e) {
			e.printStackTrace();
		}
		System.out.println("\n" + a1.getNombre() + " aprobo " + c2.getNombre() + ".");
		try {
			a1.aprobar(t1);
		} catch (AlumnoNoInscriptoException e) {
			e.printStackTrace();
		}
		System.out.println("\n" + a1.getNombre() + " aprobo " + t1.getNombre() + ".");
		try {
			a1.aprobar(t2);
		} catch (AlumnoNoInscriptoException e) {
			e.printStackTrace();
		}
		System.out.println("\n" + a1.getNombre() + " aprobo " + t2.getNombre() + ".");
		System.out.println("\nEl alumno " + a1.getNombre() + " tiene " + a1.cantCreditos() + " creditos.");
	}
}