package practica32;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		int n=0,n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero de 8 cifras: ");
		n = Integer.parseInt(sc.nextLine());
		
		n1= n/10000;
		
		n2 = n%10000;
		
		System.out.println(n1);
		System.out.println(n2);
		
		sc.close();
	}

}
