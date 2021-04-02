package problema03;

public class Temperatura {

	private double grados;
	private Escala escala;
	
	
	public Temperatura() {
		grados = 0;
		escala = Escala.CELCIUS;
	}
	
	public Temperatura(double temp, Escala escal) {
		grados = temp;
		escala = escal;
	}	

	public double getGrados() {
		return grados;
	}

	public void setGrados(double grados) {
		this.grados = grados;
	}

	public Escala getEscala() {
		return escala;
	}

	public void setEscala(Escala escala) {
		this.escala = escala;
	}
	
	public String toString() {
	String texto;
	
	if (this.getEscala() == Escala.CELCIUS)
		texto = "C°";
	else texto = "F°"; 
	
	return (this.getGrados()+texto);	
		
	}
	
	public double asCelcius() {
		
	if (this.getEscala() == Escala.CELCIUS)
		return this.getGrados();
	else return ((this.getGrados()-32)*5/9);
		
	}
	
	public double asFahrenheit() {
		
		if (this.getEscala() == Escala.FAHRENHEIT)
			return this.getGrados();
		else return (this.getGrados()*9/5+32);
			
		}
	
	public Temperatura aumentar(Temperatura temperatura) {
		if (temperatura.getGrados() > 0) {
			double nuevaTemp;
			if (this.getEscala() == temperatura.getEscala()) {
				nuevaTemp = this.getGrados() + temperatura.getGrados();
				this.setGrados(nuevaTemp);
				return (this);
			}
			else if (this.getEscala() == Escala.CELCIUS && temperatura.getEscala() == Escala.FAHRENHEIT) {
				nuevaTemp = this.getGrados() + temperatura.asCelcius();
				this.setGrados(nuevaTemp);
				return (this);
			}
			else {
				nuevaTemp = this.getGrados() + temperatura.asFahrenheit();
				this.setGrados(nuevaTemp);
				return (this);
			}
			
		}
		else return this;
	}
	
	public Temperatura disminuir(Temperatura temperatura) {
		
		if (temperatura.getGrados() > 0) {
			double nuevaTemp;
			if (this.getEscala() == temperatura.getEscala()) {
				nuevaTemp = this.getGrados() - temperatura.getGrados();
				this.setGrados(nuevaTemp);
				return (this);
			}
			else if (this.getEscala() == Escala.CELCIUS && temperatura.getEscala() == Escala.FAHRENHEIT) {
				nuevaTemp = this.getGrados() - temperatura.asCelcius();
				this.setGrados(nuevaTemp);
				return (this);
			}
			else {
				nuevaTemp = this.getGrados() - temperatura.asFahrenheit();
				this.setGrados(nuevaTemp);
				return (this);
			}
			
		}
		else return this;
		
	}
	
}
