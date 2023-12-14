package tema4.practica42;

public class PruebaJarra {
	public static void main(String[] args) {
		Jarra j1 = new Jarra(5);
		Jarra j2 = new Jarra(5);
		
		j1.rellenar(3);
		j1.traspasar(j2,2);
		impJarra(j1,1);
		impJarra(j2,2);
		
		
	}
	public static void impJarra(Jarra jarra,int numero) {
		System.out.println("Jarra "+ numero + ": " +jarra);
	}
}
