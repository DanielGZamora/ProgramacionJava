package tema3.relacion33;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = 0,numero=0,c=0;
		double media=0;
		
		for (;a<=100000;) {
			System.out.print("Dime un numero: ");
			numero = Integer.parseInt(sc.nextLine());
			c++;
			a+=numero;
			
		}
		media = (double)a/c;
		System.out.printf("Cantidad: %d\n",c);
		System.out.printf("Media: %.2f\n",media);
		System.out.printf("Acumulador: %d\n",a);
		
		sc.close();
	}
}
