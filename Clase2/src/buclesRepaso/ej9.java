package buclesRepaso;


import java.util.Scanner;

public class ej9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int acumulador;
		
		System.out.println("Indica un número:");
		numero = Integer.parseInt(teclado.nextLine());
		
		acumulador = 1;
		
		for (int i = 2; i <= numero; i++) {
			acumulador *= i;
		}
		
		System.out.printf("%d! = %d\n", numero, acumulador);
		teclado.close();
	}
}
