package problema02;

public class Recta{
	/*	ECUACION DE LA RECTA A PARTIR DE 2 PUNTOS
			(X-X1) / (X2-X1) = (Y-Y1) / (Y2-Y1)	
	*/
	private Punto pto1;
	private Punto pto2;
	
	
	//CONSTRUCTORES
		public Recta(Punto p1,Punto p2) {
		pto1 = p1;
		pto2 = p2;
		}
		public Recta() {
		pto1= new Punto (0,0);
		pto2 = new Punto (1,1);
		}
		
	public Punto getPto1() {
			return pto1;
		}
		public void setPto1(Punto pto1) {
			this.pto1 = pto1;
		}
		public Punto getPto2() {
			return pto2;
		}
		public void setPto2(Punto pto2) {
			this.pto2 = pto2;
		}
		
		
	public float pendiente() {
		float pendiente = (pto2.getCoordy() - pto1.getCoordy()) / (pto2.getCoordx() - pto1.getCoordx()); 
		return pendiente;	
	}
	
	public boolean paralelas(Recta otraRecta) {
		return (this.pendiente() == otraRecta.pendiente());
	}
		
	public boolean equals(Object otraRecta) {
		if (otraRecta instanceof Recta) {
			if(((Recta)otraRecta).pendiente() == this.pendiente()) {
				if(((Recta)otraRecta).pto1 != this.pto1) {
					
					Recta rectaAux = new Recta (((Recta)otraRecta).pto1,this.pto1);
					if(rectaAux.pendiente() == this.pendiente())
						return true;
					else return false;
					
				}
				else {
					Recta rectaAux = new Recta (((Recta)otraRecta).pto1,this.pto2);
					if(rectaAux.pendiente() == this.pendiente())
						return true;
					else return false;
					
				}
			}
			else return false;
		}
		else return false;
			
	}
	
	
}
