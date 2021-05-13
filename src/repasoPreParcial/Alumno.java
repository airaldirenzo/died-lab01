package repasoPreParcial;

import java.util.List;
import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private String nroMatricula;
	private List<Capacitacion> capRealizadas;
	private List<Capacitacion> capEnCurso;
	
	
	public String getNombre() {
		return nombre;
	}
	public String getNroMatricula() {
		return nroMatricula;
	}
	public List<Capacitacion> getCapRealizadas() {
		return capRealizadas;
	}
	public List<Capacitacion> getCapEnCurso() {
		return capEnCurso;
	}
	
	public Alumno(String nombre, String nroMatricula) {
		
		this.nombre = nombre;
		this.nroMatricula = nroMatricula;
		this.capRealizadas = new ArrayList();
		this.capEnCurso = new ArrayList();
	}
	
	
	public int cantCreditos() {
		return Capacitacion.creditosTotales(capRealizadas);
	}
	
	public void inscribir(Capacitacion c) {
		this.capEnCurso.add(c);
	}

	public void aprobar(Capacitacion c) throws AlumnoNoInscriptoException{
		boolean flag = capEnCurso.remove(c);
		if(flag)
			capRealizadas.add(c);
		else throw new AlumnoNoInscriptoException();
	}
	
	
	
}
