package repasoPreParcial;

public class Docente {

	private String nombre;
	private String email;
	private int antiguedadAnios;
	private int costoXhora;
	
	
	public Docente(String nombre, String email, int antiguedadAnios, int costoXhora) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.antiguedadAnios = antiguedadAnios;
		this.costoXhora = costoXhora;
	}


	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public int getAntiguedad() {
		return antiguedadAnios;
	}

	public int getCostoXhora() {
		return costoXhora;
	}


	
	
	
	
}
