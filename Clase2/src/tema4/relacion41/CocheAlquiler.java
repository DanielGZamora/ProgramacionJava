package tema4.relacion41;

public class CocheAlquiler {
	// Propiedades de instancia
	private String matricula;
	private String marca;
	private String modelo;
	private int numPuertas;
	private String color;
	private double tarifa;
	private boolean disponible;
	
	// Métodos de instancia
	
	/**
	 * Constructor de CocheAlquiler
	 * @param matricula
	 * @param marca 
	 * @param modelo
	 * @param numPuertas es el número de puertas
	 * @param color
	 * @param tarifa es la tarifa en euros la hora
	 * @param disponible
	 */
	public CocheAlquiler(String matricula, String marca, String modelo,
			int numPuertas, String color, double tarifa,
			String disponibleTexto) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.numPuertas = numPuertas;
		this.color = color;
		this.tarifa = tarifa;
		this.disponible = disponibleTexto.equalsIgnoreCase("si");
;
	}
	
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getNumPuertas() {
		return numPuertas;
	}


	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getTarifa() {
		return tarifa;
	}


	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	@Override
	public String toString() {
		return "CocheAlquiler [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", numPuertas="
				+ numPuertas + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + "]";
	}
	
}