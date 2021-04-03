package problema04;
import problema03.Escala;
import problema03.Temperatura;

public class Registro {
	
	private String ciudad;
	private Temperatura[] historico;
	final int capMax = 30;
	
	public Registro() {
		
		ciudad = "-";
		historico = new Temperatura[capMax];
		
	}
	
	public Registro(String unaCiudad) {
		
		ciudad = unaCiudad;
		historico = new Temperatura[capMax];
		
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	public void imprimir() {
		
		System.out.println("TEMPERATURAS REGISTRADAS EN: "+this.ciudad);
		int contador=0;
		for(Temperatura unaTemp : this.historico) {
			contador++;
			if(unaTemp != null)
				System.out.println(contador+" "+unaTemp.toString());
			else System.out.println("No se registraron mas temperaturas");
		}
	}
	
	public void agregar(Temperatura t) {
		for(int i=0; i < this.historico.length;i++) {
			if (this.historico[i] == null) {
			this.historico[i] = t;
			return;
			}

		}
		
	}
	
	public double mediaAsCelcius() {
		double media=0;
		int contador=0;
		for(Temperatura unaTemp : this.historico) {
			if(unaTemp != null) {
				contador++;
				if(unaTemp.getEscala() == Escala.CELCIUS) 
					media+=unaTemp.getGrados();
				else 
					media+=unaTemp.asCelcius();
			
			}
		}
		return (media/contador);
	}
	
	public double mediaAsFahrenheit() {
		double media=0;
		int contador=0;
		for(Temperatura unaTemp : this.historico) {
			if(unaTemp != null) {
				contador++;
				if(unaTemp.getEscala() == Escala.FAHRENHEIT) 
					media+=unaTemp.getGrados();
				else 
					media+=unaTemp.asCelcius();
			
			}
		}
		return (media/contador);
	}
	
	
	public Temperatura temperaturaMaxima(){
		if(this.historico[0] == null)
			return null;
		else {
			Temperatura maxTemp = this.historico[0];
			return esMaximo(maxTemp, 1);
		}
	}

	public Temperatura esMaximo (Temperatura maxTemp, int indice) {
		if(historico[indice] != null) {
			if (maxTemp.asCelcius() < historico[indice].asCelcius() )
				maxTemp = historico[indice];
			indice++;
			if(historico.length == indice)
				return maxTemp;
			else return esMaximo(maxTemp, indice);
			
		}
		else return maxTemp;
	}

}