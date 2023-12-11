package examenT3;

import java.util.Scanner;

public class Ejercicio3Prueba {
	
	//Pense que era asi D:
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// variables
		int acumulador = 0, tamañoClave = 4;
		String Clave = "CASA", Valor = "", Pista1 = "***A", Pista2 = "**SA", Pista3 = "*ASA", Pista = "";

		System.out.printf("La palabra secreta tiene %d letras\n", tamañoClave);

		// introducir datos
		while (!Valor.equals(Clave.toUpperCase())) {
			System.out.print("Escribe una palabra: ");
			Valor = sc.nextLine();
			Valor = Valor.toUpperCase();

			// comprobacion de datos
			if (Valor.equals(Clave))
				System.out.println("¡Enhoarabuena!");
			else {
				acumulador++;
				if (acumulador == 0) {
					Pista = Pista1;
				} else if (acumulador == 1) {
					Pista = Pista1;
				} else if (acumulador == 2) {
					Pista = Pista2;
				} else if (acumulador == 3) {
					Pista = Pista3;
				}

				System.out.println("Pista: " + Pista);
			}

		}

		sc.close();
	}
	

}
