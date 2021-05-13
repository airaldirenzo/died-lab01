package repasoPreParcial;

public class AlumnoNoInscriptoException extends Exception {
	public AlumnoNoInscriptoException() {
		super("No se encuentra inscripto en esta capacitacion");
	}
}
