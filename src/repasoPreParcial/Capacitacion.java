package repasoPreParcial;

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
	
	
	public abstract int obtenerCreditos();
	public abstract double obtenerCosto();
	
	
}
