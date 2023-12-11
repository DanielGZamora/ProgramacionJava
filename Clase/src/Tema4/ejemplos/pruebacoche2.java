package Tema4.ejemplos;

public class pruebacoche2 {
	public static void main(String[] args) {
Coche c1 = new Coche(100, 2, 3, 0, null, 0, "Audi");
		
		System.out.println(c1);
		
		c1.acelerar();
		c1.acelerar();
		
		c1.setOrientacion(270);
		c1.setSentido(Coche.SentidoMarcha.ATRAS);
		
		c1.avanzar();
		
		System.out.println(c1);
	}
}

	

