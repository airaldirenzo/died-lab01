package repasoPreParcial;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private String nroMatricula;
	private ArrayList<Capacitacion> capRealizadas;
	private ArrayList<Capacitacion> capEnCurso;
	
	
	public String getNombre() {
		return nombre;
	}
	public String getNroMatricula() {
		return nroMatricula;
	}
	public ArrayList<Capacitacion> getCapRealizadas() {
		return capRealizadas;
	}
	public ArrayList<Capacitacion> getCapEnCurso() {
		return capEnCurso;
	}
	
	public Alumno(String nombre, String nroMatricula, ArrayList<Capacitacion> capRealizadas,
			ArrayList<Capacitacion> capEnCurso) {
		
		this.nombre = nombre;
		this.nroMatricula = nroMatricula;
		this.capRealizadas = capRealizadas;
		this.capEnCurso = capEnCurso;
	}
	
	
	
	

	
	
	
	
}
