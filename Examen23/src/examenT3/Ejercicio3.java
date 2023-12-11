package examenT3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Clave = "CASA", Valor = "", Pista = "****";
		
		System.out.printf("La palabra secreta tiene %d letras\n", Clave.length());

		// introducir datos
		do{
			System.out.print("Escribe una palabra: ");
			Valor = sc.nextLine();
			Valor = Valor.toUpperCase();

			// comprobacion de datos, al final no salio
			if(Valor.substring(0,1).equals(Clave.substring(0,1))) {
				Pista = Pista.replace(Pista.substring(0, 1), Clave.substring(0, 1));
				System.out.print(Pista.substring(0, 1));
			}
			if(Valor.substring(1,2).equals(Clave.substring(1,2))) {
				Pista = Pista.replace(Pista.substring(1, 2), Clave.substring(1, 2));
				System.out.print(Pista.substring(1, 2));
			}
			if(Valor.substring(2,3).equals(Clave.substring(2,3))) {
				Pista = Pista.replace(Pista.substring(2, 3), Clave.substring(2, 3));
				System.out.print(Pista.substring(2, 3));
			}
			if(Valor.substring(3,4).equals(Clave.substring(3,4))) {
				Pista = Pista.replace(Pista.substring(3,4), Clave.substring(3,4));
				System.out.print(Pista.substring(3,4));
			}else {
				
				System.out.println("\nPista: " + Pista);
			}
			

		}while (!Valor.equals(Clave.toUpperCase())); 

		sc.close();
	}
	
}
