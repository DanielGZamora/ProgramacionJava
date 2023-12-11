package practica31;
import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tamaño;
		
		System.out.println("Dime un tañano (impar):");
		tamaño = Integer.parseInt(teclado.nextLine());
		
		// Vertical (superior)
		for (int i = 1; i <= tamaño/2; i++) {
			// Insertar espacios en blanco a la izquierda
			for (int j = 1; j <= tamaño/2; j++) {
				System.out.print(" ");
			}
			
			System.out.println("s");
		}

		// Horizontal
		for (int i = 1; i <= tamaño; i++) {
			System.out.print("h");
		}
		System.out.println();

		// Vertical (inferior)
		for (int i = 1; i <= tamaño/2; i++) {
			// Insertar espacios en blanco a la izquierda
			for (int j = 1; j <= tamaño/2; j++) {
				System.out.print(" ");
			}
			
			System.out.println("i");
			teclado.close();
		}
	}

}
