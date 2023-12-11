package examenT3;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// variables
		int acumulador = 0;
		String valor = "";

		// bucle
		while (acumulador <= 2) {
			// introducir datos
			System.out.print("Que tiempo hace hoy?(bueno/nublado/frio/lluvia/nieve): ");
			valor = sc.nextLine();

			// comprobacion de datos
			
			//tambien podia usar enum pero no tenia tiempo para cambiarlo
			if (valor.equals("nublado") || valor.equals("frio") || valor.equals("lluvia") || valor.equals("nieve")) {
				acumulador++;
			}
		}
		System.out.println("¡Este tiempo es insoportable!");
		sc.close();
		
		
		
	}
}
