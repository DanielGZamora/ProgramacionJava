package practica31;
import java.util.Scanner;

/**
 * Escribe un programa que pide un número por teclado e indique a la salida
 * cuántos de sus dígitos son pares. Por ejemplo, dado el número 12345 , la
 * salida sería 2 puesto que tiene dos dígitos pares (el 2 y el 4)
 */
public class Ejercicio4 {

	/**
	 * Punto de entrada
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		int numero;
		int ultimoDigito;
		int restoDigitos;
		int cantidadPares;

		// Entrada de datos
		System.out.println("Indique un número: ");
		numero = Integer.parseInt(teclado.nextLine());

		// Procesamiento y salida de datos
		restoDigitos = numero;
		cantidadPares = 0;

		while (restoDigitos > 0) {
			ultimoDigito = restoDigitos % 10;
			restoDigitos = restoDigitos / 10;
			
			if (ultimoDigito % 2 == 0) {
				cantidadPares++;
			}
		}

		System.out.print("Cantidad pares: " + cantidadPares);

		// Limpieza
		teclado.close();
	}

}
