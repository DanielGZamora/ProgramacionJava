package tema4.practica42;

public class TarjetaSIM {
	public int telefono;
	public byte PIN;
	public int intentos;
	
	
	
	public TarjetaSIM(int telefono, byte PIN, int intentos) {
		super();
		this.telefono = telefono;
		this.PIN = PIN;
		this.intentos = intentos;
	}

	public int getIntentos() {
		return intentos;
	}
	
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	
	
}
