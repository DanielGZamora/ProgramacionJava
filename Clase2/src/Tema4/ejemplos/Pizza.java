package Tema4.ejemplos;

public class Pizza {
	enum Estado {PEDIDA, SERVIDA};
	
	// Propiedades de instancia
	private String tamaño;
	private String tipo;
	private Estado estado;
	
	// Constructor
	public Pizza(String tamaño, String tipo) {
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.estado = Estado.PEDIDA;
	}

	// Getters y setters
	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	// toString
	public String toString() {
		//return "Pizza " + tipo + " " + tamaño + ", " + (estado == Estado.PEDIDA ? "pedida" : "servida");
		String estadoTexto = estado == Estado.PEDIDA ? "pedida" : "servida";
		return String.format("La pizza %s %s, %s", tipo, tamaño, estadoTexto);
	}
	
	// Otros métodos de instancia
	public void sirve() {
		if (estado == Estado.PEDIDA)
			estado = Estado.SERVIDA;
		else
			System.out.printf("La pizza %s %s ya se ha servido\n", tipo, tamaño);
	}
	
}