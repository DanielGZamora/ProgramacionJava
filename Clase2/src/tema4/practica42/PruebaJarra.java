package tema4.practica42;

public class PruebaJarra {
	public static void main(String[] args) {
		Jarra j1 = new Jarra(5);
		
		j1.llenar();
		System.out.println(j1);
		
		j1.vaciar();
		System.out.println(j1);
	}
}
