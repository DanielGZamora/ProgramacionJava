package tema4.practica41;

public class Tiempo {
	public int horas;
	public int minutos;
	public int segundos;
	
	public Tiempo(int horas, int minutos, int segundos) {
		super();
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	@Override
	public String toString() {
		return horas + "h " + minutos + "m " + segundos + "s";
	}
	
	
	
}
