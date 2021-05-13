package repasoPreParcial;

public class TallerCompletoException extends Exception {
	public TallerCompletoException(){
		super("No hay cupos disponibles");
	}
}
