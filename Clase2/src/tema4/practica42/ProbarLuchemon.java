package tema4.practica42;

import tema4.practica42.Luchemon.Tipo;

public class ProbarLuchemon {
	public static void main(String[] args) {
		Luchemon l1,l2;
		
		l1 = new Luchemon("Poke1", Tipo.FUEGO, 5, 100);
		l2 = new Luchemon("Poke2", Tipo.AGUA, 10, 50);
		
		System.out.println(l1);
		System.out.println(l2);
		
		l1.lucharCon(l2);
		
		System.out.println(l1);
		System.out.println(l2);
		
	}
}
