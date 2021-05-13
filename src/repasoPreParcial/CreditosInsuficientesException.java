package repasoPreParcial;

public class CreditosInsuficientesException extends Exception {
	public CreditosInsuficientesException() {
		super("No posee suficientes creditos");
	}
}
