package tema3.relacion34;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, r = 0;
		while (n >= 0) {
			System.out.print("Introduce un numero: ");
			n = Integer.parseInt(sc.nextLine());
			r = n * n;

			if (n >= 0)
				System.out.println("la solucion es: " + r);
		}
		sc.close();

	}

}

class ej1b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, r = 0;
		do {
			System.out.print("Introduce un numero: ");
			n = Integer.parseInt(sc.nextLine());
			r = n * n;

			if (n >= 0)
				System.out.println("la solucion es: " + r);
		} while (n >= 0);
		sc.close();

	}

}
