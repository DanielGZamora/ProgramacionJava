package tema4.practica41;

public class Autobus {
	private String matricula;
	private String ruta;
	private String FechaHora;
	private int asientos;
	private int asientosOcupados;
	
	public Autobus(String matricula, String ruta, String fechaHora, int asientos) {
		super();
		this.matricula = matricula;
		this.ruta = ruta;
		FechaHora = fechaHora;
		this.asientos = asientos;
	}
	
	@Override
	public String toString() {
		return "Autobus [matricula=" + matricula + ", ruta=" + ruta + ", FechaHora=" + FechaHora + ", asientos="
				+ asientos + ", asientosOcupados=" + asientosOcupados + "]";
	}

	public void reservarAsiento(int cantidad) {
		asientosOcupados += cantidad;
		cantidad -=asientos;
	}
	
	
	
}
