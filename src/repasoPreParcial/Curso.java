package repasoPreParcial;

public class Curso extends Capacitacion{

	private Capacitacion capacitacion;
	private Docente docente;
	private int cantClases;
	private int duracion;
	private int credReq;
	
	
	public Capacitacion getCapacitacion() {
		return capacitacion;
	}

	public Docente getDocente() {
		return docente;
	}

	public int getCantClases() {
		return cantClases;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getCredReq() {
		return credReq;
	}

	public Curso(String nombre, boolean prioritaria, Tema tema, boolean estrategico, Capacitacion capacitacion,
			Docente docente, int cantClases, int duracion, int credReq) {
		super(nombre, prioritaria, tema, estrategico);
		this.capacitacion = capacitacion;
		this.docente = docente;
		this.cantClases = cantClases;
		this.duracion = duracion;
		this.credReq = credReq;
	}

	public int obtenerCreditos() {
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
	
	public double obtenerCosto() {
		
		double costo = docente.getCostoXhora() * cantClases * duracion;
		
		if(estrategico)
			costo *= 1.1;
		
		return costo;
		
	}
}
