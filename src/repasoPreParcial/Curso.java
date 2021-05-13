package repasoPreParcial;

import java.util.List;

public class Curso extends Capacitacion{

	private Docente docente;
	private int cantClases;
	private int duracion;
	private Integer credReq;

	public Docente getDocente() {
		return docente;
	}

	public int getCantClases() {
		return cantClases;
	}

	public int getDuracion() {
		return duracion;
	}

	public Integer getCredReq() {
		return credReq;
	}

	public Curso(String nombre, boolean prioritaria, Tema tema, boolean estrategico,
			Docente docente, int cantClases, int duracion, Integer credReq) {
		super(nombre, prioritaria, tema, estrategico);
		this.docente = docente;
		this.cantClases = cantClases;
		this.duracion = duracion;
		this.credReq = credReq;
	}

	public Integer obtenerCreditos() {
		int creditos = 0;
		
		if(cantClases <= 5)
			creditos = cantClases * 2;
		else creditos = 10;
		
		if (docente.getAntiguedad() >= 0 && docente.getAntiguedad() <= 5)
			creditos += 1;
		else if (docente.getAntiguedad() >= 6 && docente.getAntiguedad() <= 15)
			creditos += 3;
		else if (docente.getAntiguedad() > 15)
			creditos += 5;
		
		if (prioritaria)
			creditos += 2;
		
		return creditos;
	}
	
	public Double obtenerCosto() {
		
		double costo = docente.getCostoXhora() * cantClases * duracion;
		
		if(estrategico)
			costo *= 1.1;
		
		return costo;
		
	}
	
	public static Docente DocenteCursoMayorCantCreditos (List<Capacitacion> capacitaciones) {
		return ((Curso)capacitaciones.stream()
				.filter(c -> c instanceof Curso)
				.max((c1,c2) -> ((Curso) c2).getCredReq().compareTo(((Curso) c1).getCredReq()))
				.get()).getDocente();
	}

	@Override
	public void inscribir(Alumno a) throws CreditosInsuficientesException{
		if (a.cantCreditos() < this.credReq)
			throw new CreditosInsuficientesException();
		//else listaAlumnos.add(a);
		//listaAlumnos es un atributo que debería tener la clase Capacitacion pero
		//el enunciado no lo menciona
		
	}

	@Override
	public void aprobar(Alumno a) {
		
	}
	
}
