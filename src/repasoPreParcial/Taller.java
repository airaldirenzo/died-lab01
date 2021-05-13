package repasoPreParcial;

public class Taller extends Capacitacion {

	private int duracionHrs;
	private double costoXhora;
	private int cupoMax;
	private int cantInscriptos;

	public Taller(String nombre, boolean prioritaria, Tema tema, boolean estrategico, int duracionHrs,
			double costoXhora, int cupoMax, int cantInscriptos) {
		super(nombre, prioritaria, tema, estrategico);
		this.duracionHrs = duracionHrs;
		this.costoXhora = costoXhora;
		this.cupoMax = cupoMax;
		this.cantInscriptos = cantInscriptos;
	}


	public int getDuracionHrs() {
		return duracionHrs;
	}


	public double getCostoXhora() {
		return costoXhora;
	}

	public int getCupoMax() {
		return cupoMax;
	}

	public int getCantInscriptos() {
		return cantInscriptos;
	}


	public Integer obtenerCreditos() {
		//12 creditos -> 6*12 hrs = 72hrs
		int creditos = 0;
		if (duracionHrs <= 72)
			creditos = (duracionHrs / 6);
		else creditos = 12;
		
		if (prioritaria)
			creditos += 1;
		
		return creditos;
	}
	
	public Double obtenerCosto() {
		
		double costo;
		
		costo = duracionHrs * costoXhora;
		if (estrategico)
			costo *= 1.2;
		
		return costo;
	}

	@Override
	public void inscribir(Alumno a) throws TallerCompletoException {
		if(cantInscriptos < cupoMax) {
			//alumnos.add(a);
			cantInscriptos++;
		}
		else throw new TallerCompletoException();
		
	}
	@Override
	public void aprobar(Alumno a) throws AlumnoNoInscriptoException{
		/*
		boolean flag = alumnos.remove(a);
		if(flag)
			cantInscriptos--;
		else throw new AlumnoNoInscriptoException();
		*/
	}
	
}
