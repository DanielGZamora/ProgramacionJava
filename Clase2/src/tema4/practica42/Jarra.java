package tema4.practica42;

public class Jarra {
	private int capacidad;
	private int contenido;
	/**
	 * Crea un vaso, inicialmente vacio, de la capacidad indicada.
	 * @param capacidad es lo que le coge al vaso
	 */
	public Jarra(int capacidad) {
		super();
		this.capacidad = capacidad;
		this.contenido = 0;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public int getContenido() {
		return contenido;
	}
	
	/**
	 * LLena la jarra a tope
	 */
	public void llenar() {
		contenido=capacidad;
	}
	public void vaciar() {
		contenido = 0;
	}
	/**
	 * Rellena la jarra con la cantidad indicada, si se pasa,
	 * se devuelve los litros que han sobrado
	 */
	public int rellenar(int cantidad) {
		int sobran = 0;
		contenido +=cantidad;
		if(contenido> capacidad) {
			sobran = contenido - cantidad;
			contenido=capacidad;
			
		}
		return sobran;
		
	}
	public int verter(int cantidad) {
		int resto = 0;
		contenido -=cantidad;
		if(contenido< capacidad) {
			resto = contenido + cantidad;
			contenido=capacidad;
			
		}
		return resto;
	}
	@Override
	public String toString() {
		return "Jarra [capacidad=" + capacidad + ", contenido=" + contenido + "]";
	}
	
	
}
