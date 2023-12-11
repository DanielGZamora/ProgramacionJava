package tema3;

public class caseEj3 {
	/**
	 * Programa que simula una tombola
	 *
	 */
	public static void main(String[] args) {

		// Declaracion de variales
		String tesoro;
		// Inicialicacion y entrada de datos
		tesoro = "azul";
		// Procesamiento
		// Salida de datos
		//las 2 sirven, en mi opinion para este tipo de cosas switch es un pelin inutil
		switch(tesoro) {
		case"roja":
			System.out.println("vida restaurada");
		case"azul":
			System.out.println("municion infinita");
			break;
		case"Verde":
			System.out.println("nada");
			break;
		default:
			System.out.println("nada");
		}
		

	}

}