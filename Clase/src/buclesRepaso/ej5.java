package buclesRepaso;


import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroUsuario, raizCuadrada;
		boolean esPrimo = true;
		
		System.out.println("Dime un número:");
		numeroUsuario = Integer.parseInt(teclado.nextLine());
		
		raizCuadrada = (int)Math.sqrt(numeroUsuario);
		
		for (int i = 2; i <= raizCuadrada; i++) {
			if (numeroUsuario % i == 0) {
				esPrimo = false;
				break;
			}
		}

		//if (esPrimo = true) {

		//esPrimo = true;
		//if (esPrimo) { ...
		
		if (esPrimo) {
			System.out.println("El número es primo");
		}
		else {
			System.out.println("El número no es primo");
		}
		
		
		teclado.close();
	}

}
