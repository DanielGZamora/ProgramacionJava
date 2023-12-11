package practica31;
import java.util.Scanner;

/**
 * Escribe un programa que lea un número por teclado de 4 dígitos y muestre a la
 * salida ese mismo número pero con sus dígitos invertidos. Por ejemplo, si se
 * introduce 1234 en programa dará como respuesta 4321 .
 */
public class Ejercicio3 {

	/**
	 * Punto de entrada
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		String numero;
		
		// Entrada de datos
		System.out.println("Indique un número de 4 cifras: ");
		numero = teclado.nextLine(); 
		
		// Procesamiento y salida de datos
		for (int i = numero.length()-1; i >= 0; i--) {
			System.out.print(numero.charAt(i));
		}
		
		// Limpieza
		teclado.close();
	}

}


/**
 * Escribe un programa que lea un número por teclado de 4 dígitos y muestre a la
 * salida ese mismo número pero con sus dígitos invertidos. Por ejemplo, si se
 * introduce 1234 en programa dará como respuesta 4321 .
 */
class Ejercicio3b {

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
		
		// Entrada de datos
		System.out.println("Indique un número de 4 cifras: ");
		numero = Integer.parseInt(teclado.nextLine()); 
		
		// Procesamiento y salida de datos
		restoDigitos = numero;

		for (int i = 1; i <= 4; i++) {
			ultimoDigito = restoDigitos % 10;
			restoDigitos = restoDigitos / 10;
			System.out.print(ultimoDigito);
		}
		
		// Limpieza
		teclado.close();
	}

}
