package repasoPreParcial;

import java.util.List;

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
	
	public Alumno(String nombre, String nroMatricula, List<Capacitacion> capRealizadas,
			List<Capacitacion> capEnCurso) {
		
		this.nombre = nombre;
		this.nroMatricula = nroMatricula;
		this.capRealizadas = capRealizadas;
		this.capEnCurso = capEnCurso;
	}
	
	public Alumno(String nombre, String nroMatricula) {
		
		this.nombre = nombre;
		this.nroMatricula = nroMatricula;
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
