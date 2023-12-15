package figuras.tridimensionales;

public class Cubo {
	private double base;
	private double altura;
	private double profundidad;
	private double x;
	private double y;
	private double z;
	
	//Constructores
	public Cubo(double base, double altura,double profundidad, double x, double y,double z) {
		super();
		this.base = base;
		this.altura = altura;
		this.x = x;
		this.y = y;
	}
	//Constructor2
	public Cubo(double x, double y,double z) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Cubo [base=" + base + ", altura=" + altura + ", x=" + x + ", y=" + y + " z="+ "]";
	}
	
	
}
