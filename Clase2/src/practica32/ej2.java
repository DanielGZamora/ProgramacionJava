package practica32;

import java.util.Scanner;

public class ej2 {

	/*
	 * Escribe un programa que dibuje una F con asteriscos del tamaño que se le
	 * indique por teclado (debe ser un número impar). Ten en cuenta que la anchura
	 * del trazo horizontal central debe ser la mitad del superior.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,triger=0;

		System.out.println("Dime un tañano(que no sea 1):");
		t = Integer.parseInt(sc.nextLine());

		// Primera linea
		for (int i = 1; i <= t ; i++) {
			System.out.print("*");
		}
		System.out.println();
		// vertical 
		for (int i = 0; i <= t/2-1 ; i++) {
			System.out.println("*");
			if(triger==0)		//estoy mu loco
				//segunda linea
			for (int j = 1; j <= t-2 ; j++) {
				System.out.print("*");
				
			}
			System.out.println("*");
			triger=1;
		}
		System.out.println("");
		sc.close();
	}

}