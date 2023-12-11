package examenT3;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// variables
		int x, y, z;

		// introducir datos
		System.out.print("Dame 3 numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		// solucion
		if (x > y && x > z)
			System.out.printf("el primer numero es mayor el cual equivale a: %d\n", x);
		else if (y > x && y > z)
			System.out.printf("el segundo  numero es mayor el cual equivale a: %d\n", y);
		else if (z > x && z > y)
			System.out.printf("el tercer numero es mayor el cual equivale a: %d\n", z);

		sc.close();
	}

}
