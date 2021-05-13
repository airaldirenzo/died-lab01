package repasoPreParcial;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Capacitacion {

	private String nombre;
	protected boolean prioritaria;
	private Tema tema;
	protected boolean estrategico;

	public Capacitacion(String nombre, boolean prioritaria, Tema tema, boolean estrategico) {
		super();
		this.nombre = nombre;
		this.prioritaria = prioritaria;
		this.tema = tema;
		this.estrategico = estrategico;
	}
	
	public String getNombre() {
		return nombre;
	}

	public Tema getTema() {
		return tema;
	}
	
	public abstract Integer obtenerCreditos();
	public abstract Double obtenerCosto();
	public abstract void inscribir(Alumno a) throws CreditosInsuficientesException, TallerCompletoException;
	public abstract void aprobar(Alumno a) throws AlumnoNoInscriptoException;
	
	public static int creditosTotales(List<Capacitacion> capacitaciones) {
		
		return capacitaciones.stream()
				.map(c -> c.obtenerCreditos())
				.reduce(0, (c1,c2) -> c1+c2);
	}
	
	public static double costoTotal(List<Capacitacion> capacitaciones) {
		
		return capacitaciones.stream()
				.map(c -> c.obtenerCosto())
				.reduce(0.0, (c1,c2) -> c1+c2);
	} 
	
	public static double costoPromedio(List<Capacitacion> capacitaciones) {
		
		return (Capacitacion.costoTotal(capacitaciones)/capacitaciones.size());
	}
	
	public static List<Capacitacion> ordenTemaxCostoD(List<Capacitacion> capacitaciones,Tema unTema) {
		
		return capacitaciones.stream()
				.filter(c -> c.getTema() == unTema)
				.sorted((c1,c2) ->  (c2.obtenerCosto().compareTo(c1.obtenerCosto())))
				.collect(Collectors.toList());
	}
	
	public static List<Capacitacion> estrategicas(List<Capacitacion> capacitaciones) {
		return capacitaciones.stream()
				.filter(c -> c.estrategico == true)
				.collect(Collectors.toList());
	}
	
	public static List<Capacitacion> ordenCapacCreditosD(List<Capacitacion> capacitaciones) {
		return capacitaciones.stream()
				.sorted((c1,c2) -> c2.obtenerCreditos().compareTo(c1.obtenerCreditos()))
				.collect(Collectors.toList());
				
	}
	
}
