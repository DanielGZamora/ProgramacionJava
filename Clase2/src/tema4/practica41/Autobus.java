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
		return " [matricula=" + getMatricula() + ", ruta=" + ruta + ", FechaHora=" + FechaHora + ", asientos="
				+ asientos + ", asientosOcupados=" + asientosOcupados + "]";
	}

	public void reservarAsiento(int cantidad) {
		if(cantidad - asientos > 0) {
			System.out.println("error, no puedes reservar tantos asientos");
		} else {
			asientosOcupados += cantidad;
			asientos  -= cantidad;
		}
		
	}
	public void cancelarAsiento(int cantidad) {
		if(asientosOcupados >0 && cantidad - asientosOcupados > 0) {
			System.out.println("error, no puedes cancelar mas asientos");
		}else {
			asientosOcupados-= cantidad;
			asientos  += cantidad;
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getFechaHora() {
		return FechaHora;
	}

	public void setFechaHora(String fechaHora) {
		FechaHora = fechaHora;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}
	
	
	
	
	
}
