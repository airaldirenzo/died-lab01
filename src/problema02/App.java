package problema02;

public class App {

	public static void main(String[] args){
	
	Punto P1 = new Punto(1f,1f);
	Punto P2 = new Punto(2f,2f);
	
	Recta R1 = new Recta(P1,P2);
	
	float pendiente = R1.pendiente();
	
	System.out.println("La pendiente de la recta es: "+pendiente);
	
	Punto P3 = new Punto(3f,3f);
	
	Recta R2 = new Recta(P2,P3);
	
	boolean mismaRecta = R1.equals(R2);
	
	System.out.println("La recta1 es la misma que la recta2: "+mismaRecta);
	
	}
}