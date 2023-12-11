package Tema4.ejemplos;

/**
 * Clase coche simula un coche para un vieojuego de un tablero
 */
class Coche {
	enum SentidoMarcha {
		ADELANTE, ATRAS
	};
	// Propiedades

	int fila;
	int columna;
	double combustible;
	int orientacion; // 0, 45, 90, 135, 180...
	SentidoMarcha sentido;
	int velocidad;

	String marca;

	/**
	 * Constructor Coche
	 * 
	 * @param f  es fila
	 * @param c  es columna
	 * @param lc es combustible
	 * @param m  es marca
	 */
	public Coche(int f, int c, double comb, int o, SentidoMarcha s, int v,
			String m) {
		super();
		this.fila = f;
		this.columna = c;
		this.combustible = comb;
		this.orientacion = o;
		this.sentido = s;
		this.velocidad = v;
		this.marca = m;
	}

	
	
	//avanzar
	public void avanzar() {
		int incrementoFila = 0;
		int incrementoColumna = 0;
		
		switch (orientacion) {
		case 0:
			incrementoFila = 0;
			incrementoColumna = velocidad;
			break;
		case 90:
			incrementoFila = -velocidad;
			incrementoColumna = 0;
			break;
		case 180:
			incrementoFila = 0;
			incrementoColumna = -velocidad;
			break;
		case 270:
			incrementoFila = velocidad;
			incrementoColumna = 0;
			break;
		}
		
		if (sentido == SentidoMarcha.ATRAS) {
			incrementoFila = -incrementoFila;
			incrementoColumna = -incrementoColumna;
		}
		
		fila += incrementoFila;
		columna += incrementoColumna;

		combustible -= velocidad;
	}
	// Getters Setters
	

		
	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public double getCombustible() {
		return combustible;
	}

	public void setCombustible(double combustible) {
		this.combustible = combustible;
	}

	public int getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(int orientacion) {
		this.orientacion = orientacion;
	}

	public SentidoMarcha getSentido() {
		return sentido;
	}

	public void setSentido(SentidoMarcha sentido) {
		this.sentido = sentido;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// ToString
	@Override
	public String toString() {
		return "Estado del coche: fila=" + fila + ", columna=" + columna + ", combustible=" + combustible + ", orientacion="
				+ orientacion + ", sentido=" + sentido + ", velocidad=" + velocidad + ", marca=" + marca + "";
	}


	/**
	 * Aumenta la velocidad del coche en 10Km/h
	 */
	public void acelerar() {
		velocidad += 10;
		if(velocidad>120)
			velocidad=120;
	}
	


	/**
	 * Reduce la velocidad del coche en 10Km/h
	 */
	public void frenar() {
		velocidad-=10;
		if(velocidad<=0)
			velocidad=0;
	}
	public void detener() {
		velocidad=0;
	}
	/**
	 * Gira el coche en sentido antihorario
	 */
	public void girarIzquierda() {
		orientacion = (orientacion + 45)%360;
	}
	/**
	 * Gira el coche en sentido horario
	 */
	public void girarDerecha() {
		orientacion = (orientacion - 45)%360;
	}

}
