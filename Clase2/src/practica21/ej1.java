package practica21;

import java.util.Scanner;

public class ej1 {
	/*
	 * Presenta un texto, sin salto de línea, indicando al usuario que debe
	 * introducir una fecha, dada por el día, el mes y el año en cuatro cifras, los
	 * tres separados por espacios en blanco.
	 */

	public static void main(String[] args) {
		/**
		 * Este programa recoge 2 fechas y comprueba la diferencia de dias entre ellas
		 * 
		 * Creado Por: Daniel Garcia Zamora fecha: 19-10-2023 curso: 1ºDAW
		 * 
		 */
		// escaner
		Scanner sc = new Scanner(System.in);
		// dia, mes, año
		int d, m, a;
		// dia, mes, año pero de la segunda fecha
		int d2, m2, a2;

		final double AÑODIAS = 365.25;// valor para pasar de años a dias
		final double MESDIAS = 30.4375;// valor para pasar de meses a dias
		double difDias;

		System.out.print("Introduce una fecha(DD MM AAAA): ");
		d = sc.nextInt();
		m = sc.nextInt();
		a = sc.nextInt();

		System.out.print("Introduce otra fecha(DD MM AAAA): ");
		d2 = sc.nextInt();
		m2 = sc.nextInt();
		a2 = sc.nextInt();

		/*
		 * Aqui calculamos la diferencia de dias que hay entre una fecha y la otra,
		 * tambien comprueba si el resultado es negativo o positivo, seria mas facil con
		 * un if
		 */
		difDias = d - d2 + MESDIAS * (m - m2) + AÑODIAS * (a - a2);
		difDias = (difDias < 0) ? -difDias : difDias;
		difDias = (int) difDias;

		// solución
		System.out.printf(
				"La fecha es: %02d-%02d-%04d; La segunda fecha es: %02d-%02d-%04d La diferencia de dias es: %.3f", d, m,
				a, d2, m2, a2, difDias);

		// son demasiados comentarios D:

		sc.close();
	}

}
