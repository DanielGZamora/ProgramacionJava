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
	public double getArea(){
		return Math.PI * Math.pow(radio, 2);
	}
		
}
