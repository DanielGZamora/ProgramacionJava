package tema3.relacion34;

import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n >= 0) {
			System.out.print("Introduce un numero: ");
			n = Integer.parseInt(sc.nextLine());

			if (n >= 0)
				System.out.println("Es positivo");
			else
				System.out.println("Es negativo");
		}
		sc.close();
	}

}

class ej2b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("Introduce un numero: ");
			n = Integer.parseInt(sc.nextLine());

			if (n >= 0)
				System.out.println("Es positivo");
			else
				System.out.println("Es negativo");
		} while (n != 0);
		sc.close();
	}
}