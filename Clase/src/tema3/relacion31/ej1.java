package tema3.relacion31;

import java.util.Scanner;

public class ej1 {
	/*
	 * Crea un programa en Java que pida por teclado la capital
	 * del país Tuvalu (este país es el que tiene asignado el
	 * dominio de Internet .tv). El programa tiene que mostrar 
	 * “Has acertado” o “No es correcto” en función de la 
	 * respuesta dada.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("cual es la capital de Tuvalu: ");
		String Entry=sc.nextLine();
		if(Entry.equals("Funafuti"))
			System.out.println("has acertado");
		else
			System.out.println("no acertaste");
		sc.close();
	}

}
