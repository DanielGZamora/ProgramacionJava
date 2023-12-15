package figuras.planas;

public class Rectangulo {
	private double base;
	private double altura;
	private double x;
	private double y;
	
	//Constructores
	public Rectangulo(double base, double altura, double x, double y) {
		super();
		this.base = base;
		this.altura = altura;
		this.x = x;
		this.y = y;
	}
	//Constructor2
	public Rectangulo(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", x=" + x + ", y=" + y + "]";
	}
	
	
}
