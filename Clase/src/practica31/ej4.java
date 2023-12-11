package practica31;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamaño;

		System.out.println("Dime un tañano(que no sea 1):");
		tamaño = Integer.parseInt(teclado.nextLine());

		// Primera linea
		for (int i = 1; i <= tamaño; i++) {
			System.out.print("*");
		}
		System.out.println();
		//vertical izquierda
		for (int i = 0; i <= tamaño/2; i++) {
			System.out.println("*");
		}
		// Segunda linea
		for (int i = 1; i <= tamaño; i++) {
			System.out.print("*");
		}
		System.out.println("");
		// Vertical derecha
		for (int i = 0; i <= tamaño/2; i++) {
			for (int j = 0; j <= tamaño-2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		//ultima linea
		for (int i = 1; i <= tamaño; i++) {
			System.out.print("*");
		}

		teclado.close();
	}

}
