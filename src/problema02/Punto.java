package problema02;

public class Punto{
	//ATRIBUTOS
	private float coordx;
	private float coordy;
	
	//CONSTRUCTOR
	public Punto(float x,float y) {
		coordx=x;
		coordy=y;
	}
	
	//METODOS SETTERS Y GETTERS
	public float getCoordx() {
		return coordx;
	}

	public void setCoordx(float coordx) {
		this.coordx = coordx;
	}

	public float getCoordy() {
		return coordy;
	}

	public void setCoordy(float coordy) {
		this.coordy = coordy;
	}
	
	public boolean equals(Object otroPunto) {
		if (otroPunto instanceof Punto) {
			if(this.getCoordx() == ((Punto)otroPunto).getCoordx() && this.getCoordy() == ((Punto)otroPunto).getCoordy())
				return true;
			else return false;
		} else return false;
				
	}
	
}