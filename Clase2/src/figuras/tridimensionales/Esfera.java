package figuras.tridimensionales;

public class Esfera {
	private double radio;
	private double x;
	private double y;
	private double z;
	
	//Constructores
	public Esfera(double radio, double x, double y) {
		super();
		this.radio = radio;
		this.x = x;
		this.y = y;
	}
	//Constructor2
	public Esfera(double radio) {
		super();
		
	}
	public double getArea(){
		return Math.PI * Math.pow(radio, 2);
	}
}
		
