package tema3;

public class ej2 {
	/**
	 * Programa que simula una tombola
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		// Declaracion de variales
		char resultado;
		// Inicialicacion y entrada de datos
		resultado = 'A';
//		gotasSegundo = (int) (Math.random() * 100 + 1);
		// Procesamiento

		// Salida de datos
		if (resultado == 'A') {
			System.out.println("Es A");
		} else if (resultado == 'B') {
			System.out.println("Es B");
		} else if (resultado == 'C') {
			System.out.println("Es C");
		} else {
			System.out.println("apagado");
		}
		//las 2 sirven, en mi opinion para este tipo de cosas switch es un pelin inutil
		switch(resultado) {
		case'A':
			System.out.println("es A");
			break;
		case'B':
			System.out.println("es A");
			break;
		case'C':
			System.out.println("es A");
			break;
		default:
			System.out.println("es nada");
		}
		

	}

}
