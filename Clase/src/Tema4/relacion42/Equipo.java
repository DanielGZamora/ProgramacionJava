package Tema4.relacion42;

public class Equipo {
	private String nombre;
	private int puntos;
	private int golesFavor;
	private int golesContra;
	
	//constructor
	public Equipo(String nombre ) {
		super();
		this.nombre = nombre;
	}
	
	//geters seters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getGolpesFavor() {
		return golesFavor;
	}
	public void setGolpesFavor(int golpesFavor) {
		this.golesFavor = golpesFavor;
	}
	public int getGolpesContra() {
		return golesContra;
	}
	public void setGolpesContra(int golpesContra) {
		this.golesContra = golpesContra;
	}
	
	//toString
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", puntos=" + puntos + ", golpesFavor=" + golesFavor + ", golpesContra="
				+ golesContra + "]";
	}
	
	public void partido(int golesFavor, int golesContra) {
		
	}
	
	
}
