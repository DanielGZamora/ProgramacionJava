package tema4.practica42;

public class Cafeteria {
	public static void main(String[] args) {
		Bebida c1,c2,c3,c4;
		
		c1 = new Bebida();
		c1.ponerCafe(100);
		c1.ponerDescafeinado(100);
		System.out.println("Preparacion 1: "+ c1);
		
		c2 = new Bebida();
		c2.ponerCafe(100);
		c2.ponerDesnatada(15);
		c2.ponerLeche(15);
		System.out.println("Preparacion 2: "+ c2);
		
		c3 = new Bebida();
		c3.ponerCafe(100);
		c3.ponerDesnatada(80);
		System.out.println("Preparacion 3: "+ c3);
		
		c4 = new Bebida();
		c4.ponerDescafeinado(100);
		c4.ponerDesnatada(81);
		System.out.println("Preparacion 4: "+ c4);
	}
	
}
