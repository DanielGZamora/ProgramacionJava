package tema4.relacion41;

public class Ejercicio1 {
	public static void main(String[] args) {
		CocheAlquiler unCoche;
		
		unCoche = new CocheAlquiler("1234-ABC", "Fiat",
				"Panda", 3, "rojo", 6, "si");
		
		System.out.println(unCoche);

		unCoche.setMatricula("8888-XXX");
		System.out.println(unCoche);
	}

}