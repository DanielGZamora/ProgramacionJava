package figuras.planas;

public class Circulo {
	private double radio;
	private double x;
	private double y;
	
	//Constructores
	public Circulo(double radio, double x, double y) {
		super();
		this.radio = radio;
		this.x = x;
		this.y = y;
	}
	//Constructor2
	public Circulo(double radio) {
		super();
		
	}

	public double getRadio() {
		return radio;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void setPosicion(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getArea(){
		return Math.PI * Math.pow(radio, 2);
	}
		
}
